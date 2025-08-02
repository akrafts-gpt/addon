package com.akrafts.addon

import android.app.Application
import com.akrafts.addon.di.initKoin

class MuseumApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}
