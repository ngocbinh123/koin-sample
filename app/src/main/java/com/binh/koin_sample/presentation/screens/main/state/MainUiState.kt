package com.binh.koin_sample.presentation.screens.main.state

sealed class MainUiState {
    data object Idle : MainUiState()
    data object Loading : MainUiState()
    data class Success(val data: String) : MainUiState()
    data class Error(val message: String) : MainUiState()
}