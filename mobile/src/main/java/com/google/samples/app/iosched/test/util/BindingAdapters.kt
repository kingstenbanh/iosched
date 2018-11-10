package com.google.samples.app.iosched.test.util

import android.databinding.BindingAdapter
import android.graphics.Color.TRANSPARENT
import android.support.v4.content.ContextCompat
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.google.samples.app.iosched.R
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
fun sessionTags(container: LinearLayout, sessionTags: List<Tag>?) {
    container.removeAllViews()

    if (sessionTags != null) {
        val inflater = LayoutInflater.from(container.context)
        sessionTags.forEach { container.addView(createSessionTagButton(inflater, container, it)) }
    }
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
    val tintColor = if (color != TRANSPARENT) {
        color
    } else {
        ContextCompat.getColor(textView.context, R.color.default_tag_color)
    }

    textView.compoundDrawablesRelative[0].setTint(tintColor)
}

@BindingAdapter("pageMargin")
fun pageMargin(viewPager: ViewPager, pageMargin: Float) {
    viewPager.pageMargin = pageMargin.toInt()
}