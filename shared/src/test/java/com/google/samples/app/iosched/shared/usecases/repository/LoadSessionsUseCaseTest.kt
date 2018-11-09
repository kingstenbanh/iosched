package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.result.Result
import junit.framework.Assert.assertEquals
import org.junit.Test

class LoadSessionsUseCaseTest {

    @Test
    fun returnListOfSessions() {
        val loadSessionUseCase = LoadSessionsUseCase(SessionRepository(TestSessionDataSource))
        val sessions: Result.Success<List<Session>> =
            loadSessionUseCase.executeNow(Unit) as Result.Success<List<Session>>

        assertEquals(sessions.data, SessionRepository(TestSessionDataSource).getSessions())
    }

}