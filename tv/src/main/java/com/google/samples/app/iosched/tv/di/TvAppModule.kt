package com.google.samples.app.iosched.tv.di

import android.content.Context
import com.google.samples.app.iosched.shared.data.session.SessionDataSource
import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.tv.TvApplication
import dagger.Module
import dagger.Provides

@Module
class TvAppModule {

    @Provides
    fun provideSessionRepository(sessionDataSource: SessionDataSource): SessionRepository {
        return SessionRepository(sessionDataSource)
    }
}