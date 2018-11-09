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

        // Expected values to assert
        val map = mapOf(ConferenceDay.PRECONFERENCE_DAY to listOf(TestData.session0),
            ConferenceDay.DAY_1 to listOf(TestData.session1),
            ConferenceDay.DAY_2 to listOf(TestData.session2),
            ConferenceDay.DAY_3 to listOf(TestData.session3))
        assertEquals(map, sessions.data)
    }

    object TestSessionDataSource : SessionDataSource {

        override fun getSessions(): List<Session> {
            return listOf(TestData.session0, TestData.session1, TestData.session2,
                TestData.session3)
        }
    }
}