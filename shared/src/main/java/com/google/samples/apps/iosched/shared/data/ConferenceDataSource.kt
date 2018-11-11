package com.google.samples.apps.iosched.shared.data

import com.google.samples.apps.iosched.shared.model.ConferenceData

interface ConferenceDataSource {
    fun getConferenceData(): ConferenceData?
    fun getOfflineConferenceData(): ConferenceData?
}

enum class UpdateSource {
    NONE,
    NETWORK,
    CACHE,
    BOOTSTRAP
}