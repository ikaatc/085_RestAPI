package com.example.pakeapi

import android.app.Application
import com.example.pakeapi.repository.AppContainer
import com.example.pakeapi.repository.KontakContainer

class KontakApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}