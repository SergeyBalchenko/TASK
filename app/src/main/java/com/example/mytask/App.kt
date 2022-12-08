package com.example.mytask

import android.app.Application
import com.example.mytask.data.app.DaggerAppComponent

class App: Application() {

    val appComponent = DaggerAppComponent.create()

    override fun onCreate() {
        super.onCreate()

    }
}