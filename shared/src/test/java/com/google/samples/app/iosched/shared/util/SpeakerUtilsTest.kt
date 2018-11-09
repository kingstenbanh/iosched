package com.google.samples.app.iosched.shared.util

import com.google.samples.app.iosched.shared.model.Speaker
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SpeakerUtilsTest {
    private lateinit var speaker1: Speaker
    private lateinit var speaker2: Speaker
    private lateinit var speaker3: Speaker

    @Before
    fun setup() {
        speaker1 = Speaker(
            id = "1", name = "Troy McClure", imageUrl = "",
            company = "", abstract = "", gPlusUrl = "", twitterUrl = ""
        )
        speaker2 = Speaker(
            id = "2", name = "Ziggy Anderson", imageUrl = "",
            company = "", abstract = "", gPlusUrl = "", twitterUrl = ""
        )
        speaker3 = Speaker(
            id = "3", name = "Leah Hadley", imageUrl = "",
            company = "", abstract = "", gPlusUrl = "", twitterUrl = ""
        )
    }

    @Test
    fun alphabeticallyOrderedSpeakerListSortSpeaker() {
        val speakerSet = linkedSetOf(speaker1, speaker2, speaker3)
        val speakerList = SpeakerUtils.alphabeticallyOrderedSpeakerList(speakerSet)
        val expectedSpeakerList = arrayListOf<Speaker>(speaker3, speaker1, speaker2)

        Assert.assertEquals(expectedSpeakerList, speakerList)
    }
}
