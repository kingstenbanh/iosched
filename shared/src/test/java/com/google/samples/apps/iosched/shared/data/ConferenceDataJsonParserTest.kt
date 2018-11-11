package com.google.samples.apps.iosched.shared.data

import com.google.gson.JsonSyntaxException
import com.google.samples.apps.iosched.shared.model.Speaker
import org.hamcrest.CoreMatchers.hasItem
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.core.Is.`is` as Is

private const val FILENAME = "test_conference_data1.json"
private const val MALFORMED_FILENAME = "malformed_conference_data.json"

/**
 * Unit tests for [ConferenceDataJsonParser].
 */
class ConferenceDataJsonParserTest {

    @Test
    fun testFakeData1() {
        val inputStream = this.javaClass.classLoader.getResource(FILENAME)
            .openStream()

        val data = ConferenceDataJsonParser.parseConferenceData(inputStream)

        assertThat(data.sessions.size, Is(equalTo(2)))
        assertThat(data.blocks.size, Is(equalTo(3)))
        assertThat(data.rooms.size, Is(equalTo(2)))
        assertThat(data.speakers.size, Is(equalTo(2)))
        assertThat(data.tags.size, Is(equalTo(3)))
        assertThat(data.version, Is(equalTo(42)))

        /* Relations */

        // Speakers
        val speakersSecondSession: Set<Speaker> = data.sessions[1].speakers
        val firstSpeaker: Speaker = data.speakers[0]
        assertThat(speakersSecondSession, hasItem(firstSpeaker))

        // Tags
        assertThat(data.sessions[1].tags, hasItem(data.tags[0]))

        // rooms
        assertThat(data.sessions[1].room, Is(equalTo(data.rooms[0])))
    }

    @Test(expected = JsonSyntaxException::class)
    fun testMalformedJson() {
        val inputStream = this.javaClass.classLoader.getResource(MALFORMED_FILENAME)
            .openStream()
        ConferenceDataJsonParser.parseConferenceData(inputStream)
    }
}