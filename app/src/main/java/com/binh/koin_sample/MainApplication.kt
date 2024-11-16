package com.binh.koin_sample

import android.app.Application
import com.binh.koin_sample.di.AppModule
import com.binh.koin_sample.di.DataModule
import com.binh.koin_sample.di.DomainModule
import com.binh.koin_sample.di.ViewModelModule
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            modules(
                DataModule.dataModule,
                DomainModule.domainModule,
                ViewModelModule.viewModelModule,
                AppModule.appModule
            )
        }
    }
}


