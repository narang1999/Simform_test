package com.example.simform_test

import android.app.Application
import com.example.simform_test.di.app_module
import com.example.simform_test.di.single_module

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SimformApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(app_module + single_module)
            androidContext(this@SimformApplication)
        }
    }
    }
