package com.google.samples.app.iosched.util

import android.databinding.BindingAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.google.samples.app.iosched.databinding.ItemSessionTagBinding
import com.google.samples.app.iosched.shared.model.Tag

@BindingAdapter("invisibleUnless")
fun invisibleUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) VISIBLE else INVISIBLE
}

@BindingAdapter("app:goneUnless")
fun goneUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) VISIBLE else GONE
}

@BindingAdapter("sessionTags")
fun sessionTags(container: LinearLayout, sessionTags: List<Tag>) {
    container.removeAllViews()
    val inflater = LayoutInflater.from(container.context)
    sessionTags.forEach { container.addView(createSessionTagButton(inflater, container, it)) }
}

private fun createSessionTagButton(
    inflater: LayoutInflater,
    container: ViewGroup,
    sessionTag: Tag
): Button {
    val tagBinding = ItemSessionTagBinding.inflate(inflater, container, false).apply {
        tag = sessionTag
    }
    return tagBinding.tagButton
}

@BindingAdapter("tagTint")
fun tagTing(textView: TextView, color: Int) {
    textView.compoundDrawablesRelative[0].setTint(color)
}
