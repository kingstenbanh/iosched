package com.google.samples.app.iosched.ui.schedule

import com.google.samples.app.iosched.model.TestData
import com.google.samples.app.iosched.shared.data.session.SessionDataSource
import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Unit tests for [LoadSessionsByDayUseCase]
 */
class LoadSessionsByDayUseCaseTest {

    @Test
    fun returnsMapOfSessions() {
        val useCase = LoadSessionsByDayUseCase(SessionRepository(TestSessionDataSource))
        val sessions = useCase.executeNow(SessionFilters())
            as Result.Success<Map<ConferenceDay, List<Session>>>

        assertEquals(TestData.sessionsMap, sessions.data)
    }

    object TestSessionDataSource : SessionDataSource {

        override fun getSessions(): List<Session> {
            return listOf(TestData.session0, TestData.session1, TestData.session2,
                TestData.session3)
        }

        override fun getSession(sessionId: String) = TestData.session0
    }
}