package com.google.samples.app.iosched.shared.data.session

import com.google.samples.app.iosched.shared.model.Session

interface SessionDataSource {
    fun getSessions(): List<Session>
}