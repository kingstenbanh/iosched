package com.google.samples.app.iosched.shared.data.session

import com.google.samples.app.iosched.shared.model.Session
import javax.inject.Inject
import javax.inject.Singleton

object DefaultSessionRepository : SessionRepository(RemoteSessionDataSource)

/**
 * Single point of access to session data for the presentation layer.
 */
@Singleton
open class SessionRepository @Inject constructor(private val dataSource: SessionDataSource) {

    fun getSessions(): List<Session> {
        return dataSource.getSessions()
    }

    fun getSession(sessionId: String): Session {
        return dataSource.getSession(sessionId)
    }
}