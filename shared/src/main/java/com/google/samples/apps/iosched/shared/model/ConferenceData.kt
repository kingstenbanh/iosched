package com.google.samples.apps.iosched.shared.model

/**
 * Contains schedule data with the UI models.
 */
data class ConferenceData(
    val blocks: List<Block>,
    val sessions: List<Session>,
    val speakers: List<Speaker>,
    val rooms: List<Room>,
    val tags: List<Tag>,
    val version: Int
)