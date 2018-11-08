package com.google.samples.app.iosched.shared.util

import com.google.samples.app.iosched.shared.model.Room
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_1
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class TimeUitlsTest {

    @Test
    fun conferencecDay_contains() {
        val room1 = Room(id = "1", name = "Tent 1", capacity = 40)

        val inDay1 = Session("1", DAY_1.start, DAY_1.end,
            "", "", room1, "", "", "", emptyList(), emptySet(), "", emptySet())
        assertTrue(TimeUtils.ConferenceDay.DAY_1.contains(inDay1))

        // Starts before DAY_1
        val day1MinusMinute = DAY_1.start.minusMinutes(1)
        val notInDay1 = Session("2", day1MinusMinute, DAY_1.end,
            "", "", room1, "", "", "", emptyList(), emptySet(), "", emptySet())
        assertFalse(DAY_1.contains(notInDay1))

        // Ends after DAY_1
        val day1PlusMinute = DAY_1.end.plusMinutes(1)
        val alsoNotInDay1 = Session("3", DAY_1.start, day1PlusMinute,
            "", "", room1, "", "", "", emptyList(), emptySet(), "", emptySet())
        assertFalse(DAY_1.contains(alsoNotInDay1))
    }

}