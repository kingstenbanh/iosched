package com.google.samples.app.iosched.shared.util.testdata

import com.google.samples.app.iosched.shared.model.*

/**
 * A class containing the unprocessed schedule data.
 */
class TestDataTemp(
    val blocks: List<Block>,
    val sessions: List<SessionTemp>,
    val speakers: List<Speaker>,
    val rooms: List<Room>,
    val tags: List<Tag>
)

/**
 * Contains schedule data with the UI models.
 */
class TestData(
    val blocks: List<Block>,
    val sessions: List<Session>,
    val speakers: List<Speaker>,
    val rooms: List<Room>,
    val tags: List<Tag>
)