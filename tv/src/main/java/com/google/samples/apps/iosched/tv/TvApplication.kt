/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.iosched.tv

import android.app.Application
import com.google.samples.apps.iosched.shared.di.SharedModule
import com.google.samples.apps.iosched.tv.di.DaggerTvAppComponent
import com.google.samples.apps.iosched.tv.di.TvAppComponent
import com.google.samples.apps.iosched.tv.di.TvAppModule
import com.google.samples.apps.iosched.tv.ui.schedule.di.TvScheduleComponent
import com.google.samples.apps.iosched.tv.ui.schedule.di.TvScheduleModule
import com.jakewharton.threetenabp.AndroidThreeTen
import timber.log.Timber

/**
 * Initialization of libraries.
 */
class TvApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Timber, for logging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        // ThreeTenBP for times and dates
        AndroidThreeTen.init(this)
    }

    /**
     * Components for providing the Dagger object graph and injection to fragments and activities.
     *
     * To use in a fragment, get the appropriate component and call the inject method
     *
     * ```
     * override fun onCreate(savedInstanceState: Bundle?) {
     *   super.onCreate(savedInstanceState)
     *   (context?.applicationContext as TvApplication).appComponent.inject(this)
     *   ...
     * }
     * ```
     */
    val appComponent: TvAppComponent by lazy {
        DaggerTvAppComponent.builder()
            .tvAppModule(TvAppModule(context = this))
            .sharedModule(SharedModule())
            .build()
    }
    val scheduleComponent: TvScheduleComponent by lazy {
        appComponent.plus(TvScheduleModule())
    }
}