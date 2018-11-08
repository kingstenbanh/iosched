package com.google.samples.app.iosched.ui

import android.app.Application
import com.google.samples.app.iosched.BuildConfig
import com.jakewharton.threetenabp.AndroidThreeTen
import timber.log.Timber

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Timber, for logging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        // ThreeTenBP for times and dates
        AndroidThreeTen.init(this)
    }
}