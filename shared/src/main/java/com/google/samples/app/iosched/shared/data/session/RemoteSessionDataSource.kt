package com.google.samples.app.iosched.shared.data.session

import com.google.samples.app.iosched.shared.model.Room
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.model.Speaker
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay


interface SessionDataSource {
    fun getSessions(): List<Session>
}

/**
 * TODO: Placeholder
 */
object RemoteSessionDataSource : SessionDataSource {

    private val SESSIONS: List<Session> by lazy {
        val androidTag = Tag("1", "TRACK", 0, "Android", 0xFFAED581.toInt())
        val webTag = Tag("2", "TRACK", 1, "Web", 0xFFFFF176.toInt())
        val speakers = setOf(Speaker("1", "Troy McClure", "", "", "", "", ""))
        val room = Room(id = "1", name = "Tent 1", capacity = 40)

        val list = ArrayList<Session>()
        for (i in 1..90) {
            val startTime = when (i % 3) {
                0 -> ConferenceDay.DAY_1.start.plusHours(2)
                1 -> ConferenceDay.DAY_2.start.plusHours(2)
                else -> ConferenceDay.DAY_3.start.plusHours(2)
            }
            val tags = if (i % 2 == 0) {
                listOf(androidTag)
            } else {
                listOf(webTag)
            }
            list.add(Session(i.toString(),
                startTime = startTime,
                endTime = startTime.plusHours(1),
                title = "Session $i",
                abstract = "",
                room = room,
                sessionUrl = "",
                liveStreamUrl = "",
                youTubeUrl = "",
                photoUrl = "",
                tags = tags,
                speakers = speakers,
                relatedSessions = emptySet()))
        }
        list
    }

    override fun getSessions() = SESSIONS
}