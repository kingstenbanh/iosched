package com.google.samples.app.iosched.ui.schedule

import android.content.Context
import android.databinding.BindingAdapter
import android.widget.TextView
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.util.duration
import org.threeten.bp.Duration

@BindingAdapter("sessionLengthLocation")
fun sessionLengthLocation(textView: TextView, session: Session) {
    textView.text = textView.context.getString(R.string.session_duration_location,
        durationString(textView.context, session.duration), session.room.name)
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