package com.google.samples.app.iosched.shared.data.session

import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.util.ConferenceDataJsonParser

object FakeSessionDataSource : SessionDataSource {
    override fun getSessions(): List<Session> = ConferenceDataJsonParser.getSessions()

    override fun getSession(sessionId: String) = ConferenceDataJsonParser.getSessions()[0]
}