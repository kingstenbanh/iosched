package com.google.samples.app.iosched.shared.data.session

import com.google.samples.app.iosched.shared.model.Session
import javax.inject.Inject
import javax.inject.Singleton

object DefaultSessionRepository : SessionRepository(RemoteSessionDataSource)

@Singleton
open class SessionRepository @Inject constructor(private val dataSource: SessionDataSource) {

    fun getSessions(): List<Session> {
        return dataSource.getSessions()
    }

}