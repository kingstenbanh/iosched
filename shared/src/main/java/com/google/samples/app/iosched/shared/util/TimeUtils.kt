package com.google.samples.app.iosched.shared.util

import com.google.samples.app.iosched.shared.BuildConfig
import com.google.samples.app.iosched.shared.model.Session
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime
import org.threeten.bp.format.DateTimeFormatter
import java.util.*

object TimeUtils {
    val CONFERENCE_TIMEZONE = ZoneId.of(BuildConfig.CONFERENCE_TIMEZONE)
    val CONFERENCE_DAYS = ConferenceDay.values()

    private val formatPattern = "MMMM d"
    val FORMATTER_MONTH_DAY = DateTimeFormatter.ofPattern(formatPattern, Locale.getDefault())

    enum class ConferenceDay(val start: ZonedDateTime, val end: ZonedDateTime) {
        DAY_1(ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY1_START),
            ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY1_END)),
        DAY_2(ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY2_START),
            ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY2_END)),
        DAY_3(ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY3_START),
            ZonedDateTime.parse(BuildConfig.CONFERENCE_DAY3_END));

        fun contains(session: Session) = start <= session.startTime && end >= session.endTime

        fun formatMonthDay() = FORMATTER_MONTH_DAY.format(start)
    }

    fun timeString(startTime: ZonedDateTime, endTime: ZonedDateTime): String {
        val sb = StringBuilder()
        sb.append(DateTimeFormatter.ofPattern("EEE, MMM d, h:mm ").format(startTime))

        val startTimeMeridiem: String = DateTimeFormatter.ofPattern("a").format(startTime)
        val endTimeMeridiem: String = DateTimeFormatter.ofPattern("a").format(endTime)

        if (startTimeMeridiem != endTimeMeridiem) {
            sb.append(startTimeMeridiem).append(" ")
        }

        sb.append(DateTimeFormatter.ofPattern("- h:mm a").format(endTime))
        return sb.toString()
    }

}