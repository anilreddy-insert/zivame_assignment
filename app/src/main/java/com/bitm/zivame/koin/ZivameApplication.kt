package com.bitm.zivame.koin

import android.app.Application

class ZivameApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        getAppKoinLayer(this)
    }
}