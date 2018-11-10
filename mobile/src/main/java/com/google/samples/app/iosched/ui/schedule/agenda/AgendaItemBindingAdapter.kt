package com.google.samples.app.iosched.ui.schedule.agenda

import android.databinding.BindingAdapter
import android.graphics.drawable.GradientDrawable
import android.support.v7.content.res.AppCompatResources
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.samples.app.iosched.R
import org.threeten.bp.ZonedDateTime
import org.threeten.bp.format.DateTimeFormatter

private val agendaTimePattern = DateTimeFormatter.ofPattern("h:mm a")

@BindingAdapter(value=["agendaColor", "agendaStrokeColor", "agendaStrokeWidth"], requireAll = true)
fun agendaColor(view: View, fillColor: Int, strokeColor: Int, strokeWidth: Float) {
    view.background = (view.background as? GradientDrawable ?: GradientDrawable()).apply {
        setColor(fillColor)
        setStroke(strokeWidth.toInt(), strokeColor)
    }
}

@BindingAdapter("agendaIcon")
fun agendaIcon(imageView: ImageView, type: String) {
    val iconId = when (type) {
        "after_hours" -> R.drawable.ic_agenda_after_hours
        "badge" -> R.drawable.ic_agenda_badge
        "codelab" -> R.drawable.ic_agenda_codelab
        "concert" -> R.drawable.ic_agenda_concert
        "keynote" -> R.drawable.ic_agenda_keynote
        "meal" -> R.drawable.ic_agenda_meal
        "office_hours" -> R.drawable.ic_agenda_office_hours
        "sandbox" -> R.drawable.ic_agenda_sandbox
        "store" -> R.drawable.ic_agenda_store
        else -> R.drawable.ic_agenda_session
    }
    imageView.setImageDrawable(AppCompatResources.getDrawable(imageView.context, iconId))
}

@BindingAdapter(value=["startTime", "endTime"], requireAll = true)
fun agendaDuration(textView: TextView, startTime: ZonedDateTime, endTime: ZonedDateTime) {
    textView.text = textView.context.getString(R.string.agenda_duration,
        agendaTimePattern.format(startTime),
        agendaTimePattern.format(endTime))
}