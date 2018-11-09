package com.google.samples.app.iosched.shared.util

import com.google.gson.GsonBuilder
import com.google.gson.stream.JsonReader
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.util.testdata.*

private val FILENAME = "conference_data.json"

object ConferenceDataJsonParser {

    fun getSessions(): List<Session> {
        val inputStream = this.javaClass.classLoader.getResource(FILENAME)
            .openStream()
        val jsonReader = JsonReader(inputStream.bufferedReader())
        val gson = GsonBuilder()
            .registerTypeAdapter(SessionTemp::class.java, SessionDeserializer())
            .registerTypeAdapter(Tag::class.java, TagDeserializer())
            .create()
        val tempData: TestDataTemp = gson.fromJson(jsonReader, TestDataTemp::class.java)
        val testData = normalize(tempData)

        return testData.sessions
    }

    /**
     * Adds nested objects like `session.tags`
     */
    private fun normalize(data: TestDataTemp): TestData {
        val sessions: MutableList<Session> = mutableListOf()

        data.sessions.forEach { session: SessionTemp ->
            val newSession = Session(
                id = session.id,
                startTime = session.startTime,
                endTime = session.endTime,
                title = session.title,
                abstract = session.abstract,
                sessionUrl = session.sessionUrl,
                liveStreamUrl = session.liveStreamUrl,
                youTubeUrl = session.youTubeUrl,
                tags = data.tags.filter { it.id in session.tags },
                speakers = data.speakers.filter { it.id in session.speakers }.toSet(),
                photoUrl = session.photoUrl,
                relatedSessions = session.relatedSessions,
                room = data.rooms.first { it.id == session.room }
            )
            sessions.add(newSession)
        }

        return TestData(sessions = sessions,
                tags = data.tags,
                speakers = data.speakers,
                blocks = data.blocks,
                rooms = data.rooms)
    }
}