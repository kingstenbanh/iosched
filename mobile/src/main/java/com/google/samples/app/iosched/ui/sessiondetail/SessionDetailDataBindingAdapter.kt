package com.google.samples.app.iosched.ui.sessiondetail

import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.databinding.ItemSpeakerDetailBinding
import com.google.samples.app.iosched.shared.model.Speaker
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.util.SpeakerUtils

@BindingAdapter("app:sessionTags")
fun sessionTags(layout: LinearLayout, sessionTags: List<Tag>) {
    val inf = LayoutInflater.from(layout.context)
    layout.removeAllViews()
    sessionTags.forEach { layout.addView(createSessionTagButton(inf, layout, it)) }
}

@BindingAdapter("app:sessionSpeakers")
fun sessionSpeakers(layout: LinearLayout, speakers: Set<Speaker>) {
    layout.removeAllViews()
    SpeakerUtils.alphabeticallyOrderedSpeakerList(speakers).forEach {
        layout.addView(createSessionSpeakerView(layout, it))
    }
}

private fun createSessionTagButton(
    inflater: LayoutInflater,
    container: ViewGroup,
    tag: Tag
    ): Button {
    return (inflater.inflate(R.layout.item_session_tag, container, false) as Button).apply {
        text = tag.name
        background.setColorFilter(tag.color, PorterDuff.Mode.SRC_ATOP)
    }
}

private fun createSessionSpeakerView(
    container: ViewGroup,
    speaker: Speaker
): View {
    val binding: ItemSpeakerDetailBinding = DataBindingUtil.inflate(
        LayoutInflater.from(container.context),
        R.layout.item_speaker_detail,
        container,
        false
    )

    binding.speaker = speaker
    return binding.root
}