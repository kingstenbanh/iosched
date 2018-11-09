package com.google.samples.app.iosched.shared.util

import com.google.samples.app.iosched.shared.model.Room
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_1
import org.junit.Assert
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.threeten.bp.ZonedDateTime

class TimeUitlsTest {

    private lateinit var time0800: ZonedDateTime
    private lateinit var time1000: ZonedDateTime
    private lateinit var time1300: ZonedDateTime

    @Before
    fun setup() {
        time0800 = ZonedDateTime.parse("2018-05-08T08:00:00.000-08:00[America/Los_Angeles]")
        time1000 = ZonedDateTime.parse("2018-05-08T10:00:00.000-08:00[America/Los_Angeles]")
        time1300 = ZonedDateTime.parse("2018-05-08T13:00:00.000-08:00[America/Los_Angeles]")
    }

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

    @Test fun timeString_sameMeridiem() {
        Assert.assertEquals("Tue, May 8, 10:00 - 11:00 AM",
            TimeUtils.timeString(time1000, time1000.plusHours(1)))
        Assert.assertEquals("Tue, May 8, 1:00 - 2:00 PM",
            TimeUtils.timeString(time1300, time1300.plusHours(1)))
    }
    @Test fun timeString_differentMeridiem() {
        Assert.assertEquals("Tue, May 8, 10:00 AM - 12:00 PM",
            TimeUtils.timeString(time1000, time1000.plusHours(2)))
    }
    @Test fun timeString_omitsLeadingZeroInDate() {
        Assert.assertEquals("Tue, May 8, 8:00 - 9:00 AM",
            TimeUtils.timeString(time0800, time0800.plusHours(1)))
        val timeMay10 = ZonedDateTime.parse("2018-05-10T13:00:00.000-08:00[America/Los_Angeles]")
        Assert.assertEquals("Thu, May 10, 1:00 - 2:00 PM",
            TimeUtils.timeString(timeMay10, timeMay10.plusHours(1)))
    }
    @Test fun timeString_omitsLeadingZeroInTime() {
        Assert.assertEquals("Tue, May 8, 8:00 - 9:00 AM",
            TimeUtils.timeString(time0800, time0800.plusHours(1)))
        Assert.assertEquals("Tue, May 8, 8:00 - 10:00 AM",
            TimeUtils.timeString(time0800, time1000))
        Assert.assertEquals("Tue, May 8, 12:00 - 1:00 PM",
            TimeUtils.timeString(time1300.minusHours(1), time1300))
    }
}