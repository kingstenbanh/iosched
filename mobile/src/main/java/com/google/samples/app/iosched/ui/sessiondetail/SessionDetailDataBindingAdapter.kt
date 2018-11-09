package com.google.samples.app.iosched.ui.sessiondetail

import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.databinding.ItemSpeakerDetailBinding
import com.google.samples.app.iosched.shared.model.Speaker
import com.google.samples.app.iosched.shared.util.SpeakerUtils

@BindingAdapter("app:sessionSpeakers")
fun sessionSpeakers(layout: LinearLayout, speakers: Set<Speaker>?) {
    layout.removeAllViews()

    if (speakers != null) {
        SpeakerUtils.alphabeticallyOrderedSpeakerList(speakers).forEach {
            layout.addView(createSessionSpeakerView(layout, it))
        }
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