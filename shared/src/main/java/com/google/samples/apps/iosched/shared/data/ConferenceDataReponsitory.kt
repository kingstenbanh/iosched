package com.google.samples.apps.iosched.shared.data

import com.google.samples.apps.iosched.shared.model.ConferenceData
import timber.log.Timber
import java.io.IOException
import javax.inject.Inject
import javax.inject.Named

/**
 * Single point of access to session data for the presentation layer.
 *
 * The session data is loaded from the bootstrap file.
 */
open class ConferenceDataRepository @Inject constructor(
    @Named("remoteConfDatasource") private val remoteDataSource: ConferenceDataSource,
    @Named("bootstrapConfDataSource") private val boostrapDataSource: ConferenceDataSource
) {
    // In-memory cache of the conference data
    private var conferenceDataCache: ConferenceData? = null

    var dataLastUpdated = 0L
        private set

    val currentConferenceDataVersion: Int
        get() = conferenceDataCache?.version ?: 0

    var latestException: Exception? = null
        private set

    var latestUpdateSource: UpdateSource = UpdateSource.NONE
        private set

    fun getConferenceData(forceUpdate: Boolean = false): ConferenceData {
        if (forceUpdate || conferenceDataCache == null) {
            conferenceDataCache = loadConferenceData()
        }
        return conferenceDataCache!!
    }

    fun getOfflineConferenceData(): ConferenceData {
        val localData = remoteDataSource.getOfflineConferenceData()
            ?:  boostrapDataSource.getOfflineConferenceData()!!
        return localData
    }

    private fun loadConferenceData(): ConferenceData {
        var conferenceData: ConferenceData? = null

        // Try the network data source first
        try {
            conferenceData = remoteDataSource.getConferenceData()
        } catch (e: IOException) {
            Timber.d(e)
            latestException = e
        }

        // Network data success!
        if (conferenceData != null) {
            latestException = null
            dataLastUpdated = System.currentTimeMillis()
            latestUpdateSource = UpdateSource.NETWORK
            latestException = null
            return conferenceData
        }

        // Second, try the local cache:
        conferenceData = remoteDataSource.getOfflineConferenceData()

        //Cache success!
        if (conferenceData != null) {
            latestUpdateSource = UpdateSource.CACHE
            return conferenceData
        }

        // Third, use the bootstrap file:
        conferenceData = boostrapDataSource.getOfflineConferenceData()!!
        latestUpdateSource = UpdateSource.BOOTSTRAP
        return conferenceData
    }
}