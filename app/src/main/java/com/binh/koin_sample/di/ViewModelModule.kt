package com.binh.koin_sample.di

import com.binh.koin_sample.presentation.screens.main.MainViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

object ViewModelModule {
    val viewModelModule = module {
        viewModelOf(::MainViewModel)
    }
}