package com.google.samples.app.iosched.ui.schedule

import android.content.Context
import android.databinding.BindingAdapter
import android.widget.TextView
import com.google.samples.app.iosched.R
import org.threeten.bp.Duration
import org.threeten.bp.ZonedDateTime

@BindingAdapter(value = ["sessionStart", "sessionEnd", "sessionRoom"])
fun sessionLengthLocation(
    textView: TextView,
    startTime: ZonedDateTime,
    endTime: ZonedDateTime,
    room: String
) {
    textView.text = textView.context.getString(
        R.string.session_duration_location,
        durationString(textView.context, Duration.between(startTime, endTime)),
        room
    )
}

private fun durationString(context: Context, duration: Duration): String {
    val hours = duration.toHours()
    return if (hours > 0L) {
        context.resources.getQuantityString(R.plurals.duration_hours, hours.toInt(), hours)
    } else {
        val minutes = duration.toMinutes()
        context.resources.getQuantityString(R.plurals.duration_minutes, minutes.toInt(), minutes)
    }
}