package com.binh.koin_sample.presentation.screens.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.binh.koin_sample.domain.request.GetCurrentTripRequest
import com.binh.koin_sample.domain.usecases.GetCurrentTripUseCase
import com.binh.koin_sample.presentation.screens.main.state.MainUiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class MainViewModel(
    private val getCurrentTripUseCase: GetCurrentTripUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow<MainUiState>(MainUiState.Idle)
    val uiState: StateFlow<MainUiState> get() = _uiState

    init {
        viewModelScope.launch {
            getCurrentTripUseCase.execute(GetCurrentTripRequest)
                .onStart {
                    _uiState.tryEmit(MainUiState.Loading)
                }
                .map {
                    MainUiState.Success(it)
                }
                .flowOn(Dispatchers.IO)
                .collect {
                    _uiState.tryEmit(it)
                }
        }
    }
}