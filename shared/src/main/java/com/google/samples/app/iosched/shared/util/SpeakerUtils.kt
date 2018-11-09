package com.google.samples.app.iosched.shared.util

import com.google.samples.app.iosched.shared.model.Speaker

object SpeakerUtils {

    fun alphabeticallyOrderedSpeakerList(speakerSet: Set<Speaker>) =
        ArrayList<Speaker>(speakerSet).sortedBy { it.name }
}