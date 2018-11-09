package com.google.samples.app.iosched.ui.sessiondetail

import android.databinding.BindingAdapter
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.shared.model.Tag

@BindingAdapter("app:sessionTags")
fun sessionTags(layout: LinearLayout, sessionTags: List<Tag>) {
    val inf = LayoutInflater.from(layout.context)
    layout.removeAllViews()
    sessionTags.forEach { layout.addView(createSessionTagButton(inf, layout, it)) }
}

private fun createSessionTagButton(
    inflater: LayoutInflater,
    container: ViewGroup,
    tag: Tag
    ): Button {
    return (inflater.inflate(R.layout.item_session_tag, container, false) as Button).apply {
        text = tag.name
        background.setColorFilter(Color.parseColor(tag.color), PorterDuff.Mode.SRC_ATOP)
    }
}