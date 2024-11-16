package com.binh.koin_sample.presentation.screens.main

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.binh.koin_sample.presentation.screens.main.state.MainUiState

@BindingAdapter("mainUiState")
fun bindUiState(textView: TextView, uiState: MainUiState?) {
    textView.text = when (uiState) {
        is MainUiState.Idle -> ""
        is MainUiState.Loading -> "is Loading..."
        is MainUiState.Success -> uiState.data
        is MainUiState.Error -> "Failure"
        else -> "N/A"
    }
}