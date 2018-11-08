package com.google.samples.app.iosched.shared.data.session

import com.google.samples.app.iosched.shared.model.Room
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.model.Speaker
import com.google.samples.app.iosched.shared.model.Tag
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime

interface SessionDataSource {
    fun getSessions(): List<Session>
}

object RemoteSessionDataSource: SessionDataSource {
    override fun getSessions(): List<Session> {

        val androidTag = Tag("1", "Technology", "Android", "#F30F30")
        val webTag = Tag("2", "Technology", "Web", "#F30F30")
        val speaker1 = Speaker("1", "Troy McClure")
        val time1 = ZonedDateTime.of(2018, 11, 7, 12, 0, 0, 0, ZoneId.of("Asia/Tokyo"))
        val time2 = ZonedDateTime.of(2018, 11, 7, 13, 0, 0, 0, ZoneId.of("Asia/Tokyo"))
        val room1 = Room(id = "1", name = "Tent 1", capacity = 40)
        val session1 = Session(id = "1", startTime = time1, endTime = time2,
            title = "Fuchsia", abstract = "", room = room1, sessionUrl = "", liveStreamUrl = "",
            youTubeUrl = "", tags = listOf(androidTag, webTag), speakers = setOf(speaker1),
            photoUrl = "", relatedSessions = emptySet())

        val session2 = Session(id = "2", startTime = time1, endTime = time2,
            title = "AIA", abstract = "", room = room1, sessionUrl = "Title 1", liveStreamUrl = "",
            youTubeUrl = "", tags = listOf(androidTag), speakers = setOf(speaker1),
            photoUrl = "", relatedSessions = emptySet())
        val session3 = Session(id = "3", startTime = time1, endTime = time2,
            title = "AMP", abstract = "", room = room1, sessionUrl = "Title 1", liveStreamUrl = "",
            youTubeUrl = "", tags = listOf(webTag), speakers = setOf(speaker1),
            photoUrl = "", relatedSessions = emptySet())

        return listOf(session1, session2, session3)
    }
}