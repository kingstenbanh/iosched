package com.google.samples.app.iosched.tv.di

import android.content.Context
import com.google.samples.app.iosched.tv.TVApplication
import dagger.Module
import dagger.Provides

@Module
class TVAppModule {

    @Provides
    fun provideContext(application: TVApplication): Context {
        return application.applicationContext
    }
}