package com.google.samples.app.iosched.shared.di

import com.google.samples.app.iosched.shared.data.map.MapMetadataDataSource
import com.google.samples.app.iosched.shared.data.map.RemoteMapMetadataDataSource
import com.google.samples.app.iosched.shared.data.session.RemoteSessionDataSource
import com.google.samples.app.iosched.shared.data.session.SessionDataSource
import com.google.samples.app.iosched.shared.data.tag.RemoteTagDataSource
import com.google.samples.app.iosched.shared.data.tag.TagDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Module where classes created in the shared module are created.
 */
@Module
class SharedModule {
    // Define the data source implementations that should be used. All data sources are singletons.
    @Singleton
    @Provides
    fun provideSessionDataSource(): SessionDataSource {
        return RemoteSessionDataSource
    }

    @Singleton
    @Provides
    fun provideTagDataSource(): TagDataSource {
        return RemoteTagDataSource
    }

    @Singleton
    @Provides
    fun provideMapMetadataDataSource(): MapMetadataDataSource {
        return RemoteMapMetadataDataSource()
    }
}
