package com.google.samples.app.iosched.tv

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import timber.log.Timber

/**
 * Initialization of libraries
 */
class TvApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Timber, for loging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        // ThreeTenBP for times and dates
        AndroidThreeTen.init(this)
    }
}