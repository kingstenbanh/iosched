package com.google.samples.app.iosched.shared.util

import com.google.samples.app.iosched.shared.BuildConfig
import com.google.samples.app.iosched.shared.model.Session
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime

object TimeUtils {
    val CONFERENCE_TIMEZONE = ZoneId.of(BuildConfig.CONFERENCE_TIMEZONE)
    val CONFERENCE_DAYS = ConferenceDay.values()

    enum class ConferenceDay(val start: ZonedDateTime, val end: ZonedDateTime) {
        PRECONFERENCE_DAY(ZonedDateTime.parse(BuildConfig.PRECONFERENCE_DAY_START),
            ZonedDateTime.parse(BuildConfig.PRECONFERENCE_DAY_END)),
        DAY_1(ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY1_START),
            ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY1_END)),
        DAY_2(ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY2_START),
            ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY2_END)),
        DAY_3(ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY3_START),
            ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY3_END));

        fun contains(session: Session) = start <= session.startTime && end >= session.endTime
    }
}