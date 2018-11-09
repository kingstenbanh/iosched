package com.google.samples.app.iosched.tv.di

import android.content.Context
import com.google.samples.app.iosched.tv.MainApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(application: MainApplication): Context {
        return application.applicationContext
    }
}