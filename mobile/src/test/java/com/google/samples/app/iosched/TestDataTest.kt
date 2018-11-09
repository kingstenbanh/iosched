package com.google.samples.app.iosched

import com.google.samples.app.iosched.shared.util.ConferenceDataJsonParser
import org.junit.Assert.assertTrue
import org.junit.Test


/**
 * Checks that the data loading mechanism for the staging variant works.
 */
class TestDataTest {

    @Test
    fun loadJson_resultIsNotEmpty() {
        val sessions = ConferenceDataJsonParser.getSessions()
        assertTrue(sessions.isNotEmpty())
    }
}
