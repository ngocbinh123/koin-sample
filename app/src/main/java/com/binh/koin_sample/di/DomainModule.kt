package com.binh.koin_sample.di

import com.binh.koin_sample.domain.usecases.GetCurrentTripUseCase
import com.binh.koin_sample.domain.usecases.GetCurrentTripUseCaseImpl
import org.koin.dsl.module

object DomainModule {
    //    init dataModule variable to inject GetCurrentTripRepository by koin, instance of GetCurrentTripRepository is GetCurrentTripRepositoryImpl
    val domainModule = module {
        single<GetCurrentTripUseCase> {
            GetCurrentTripUseCaseImpl(get())
        }
    }

}