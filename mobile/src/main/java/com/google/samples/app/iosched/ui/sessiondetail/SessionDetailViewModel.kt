package com.google.samples.app.iosched.ui.sessiondetail

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.shared.model.Room
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.model.Speaker
import com.google.samples.app.iosched.shared.model.Tag
import org.threeten.bp.ZonedDateTime

class SessionDetailViewModel(sessionId: String): ViewModel() {

    private val session = MutableLiveData<Session>()

    init {
        // TODO connect with UseCase to get data from data layer
        val androidTag = Tag(id = "1", category = "Technology", name = "Android", color = "#F30F30")

        val webTag = Tag(id = "2", category = "Technology", name = "Web", color = "#F30F30")

        val dummySpeaker = Speaker(id = "1", name = "Troy McClure", imageUrl = "",
            company = "", abstract = "", gPlusUrl = "", twitterUrl = "")

        val room = Room(id = "1", name = "Tent 1", capacity = 40)

        val dummySession = Session(id = "1", startTime = ZonedDateTime.now(),
            endTime = ZonedDateTime.now().plusHours(1),
            title = "Fuchsia", abstract = "", room = room, sessionUrl = "", liveStreamUrl = "",
            youTubeUrl = "", tags = listOf(androidTag, webTag), speakers = setOf(dummySpeaker),
            photoUrl = "", relatedSessions = emptySet())

        session.value = dummySession
    }

}