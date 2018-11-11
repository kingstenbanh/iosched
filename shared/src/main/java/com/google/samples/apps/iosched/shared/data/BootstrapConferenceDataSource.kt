package com.google.samples.apps.iosched.shared.data

import com.google.samples.apps.iosched.shared.model.ConferenceData

const val bootstrap_conference_data_filename = "conference_data.json"

/**
 * Loads bootstrap data file from resources and parses it.
 */
object BootstrapConferenceDataSource : ConferenceDataSource {
    override fun getConferenceData(): ConferenceData? {
        throw Exception("Bootstrap data source doesn't have remote data")
    }

    override fun getOfflineConferenceData(): ConferenceData? {
        return loadAndParseBootstrapData()
    }

    fun loadAndParseBootstrapData(): ConferenceData {
        val conferenceDataStream = this.javaClass.classLoader
            .getResource(bootstrap_conference_data_filename).openStream()
        return ConferenceDataJsonParser.parseConferenceData(conferenceDataStream)
    }
}