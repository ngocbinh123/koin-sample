package com.binh.koin_sample.di

import com.binh.koin_sample.data.repositories.GetCurrentTripRepositoryImpl
import com.binh.koin_sample.domain.repositories.GetCurrentTripRepository
import org.koin.dsl.module

object DataModule {
    //    init dataModule variable to inject GetCurrentTripRepository by koin, instance of GetCurrentTripRepository is GetCurrentTripRepositoryImpl
    val dataModule = module {
        single<GetCurrentTripRepository> { GetCurrentTripRepositoryImpl() }
    }

}