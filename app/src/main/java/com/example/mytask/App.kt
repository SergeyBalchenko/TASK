package com.example.mytask

import android.app.Application
import com.example.mytask.di.AppComponent
import com.example.mytask.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .context(this)
            .build()
    }
}