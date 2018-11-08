package com.google.samples.app.iosched.shared.di

import com.google.samples.app.iosched.shared.data.session.RemoteSessionDataSource
import com.google.samples.app.iosched.shared.data.session.SessionDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Module where classes created in the shared module are created.
 */
@Module
class SharedModule {
    /**
     * Defines the implementation of [SessionDataSource] that should be used.
     * The [SessionDataSource] is a singleton.
     */
    @Singleton
    @Provides
    fun provideSessionDataSource(): SessionDataSource {
        return RemoteSessionDataSource
    }
}