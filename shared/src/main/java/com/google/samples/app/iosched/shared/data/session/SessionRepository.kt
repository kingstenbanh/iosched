package com.google.samples.app.iosched.shared.data.session

import com.google.samples.app.iosched.shared.model.Session

object DefaultSessionRepository : SessionRepository(RemoteSessionDataSource)

open class SessionRepository(private val remoteDataSource: SessionDataSource) {

    fun getSessions(): List<Session> {
        return remoteDataSource.getSessions()
    }

}