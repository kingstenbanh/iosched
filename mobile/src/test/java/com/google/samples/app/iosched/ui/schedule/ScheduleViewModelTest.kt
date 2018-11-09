package com.google.samples.app.iosched.ui.schedule

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.samples.app.iosched.model.TestData
import com.google.samples.app.iosched.shared.data.session.DefaultSessionRepository
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.usecases.repository.LoadSessionsUseCase
import com.google.samples.app.iosched.util.LiveDataTestUtil
import com.google.samples.app.iosched.util.SyncTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

class ScheduleViewModelTest {

    // Executes tasks in the Architecture Components in the same thread
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    // Executes tasks in a synchronous [TaskScheduler]
    @get:Rule
    var syncTaskExecutorRule = SyncTaskExecutorRule()

    @Test
    fun testDataIsLoaded_ObservablesUpdated() {
        // Create a test use cases with test data
        val testData = TestSessionDataSource.getSessions()
        val loadSessionsUseCase = createUseCase(testData)

        // Create ViewModel with the use case
        val viewModel = ScheduleViewModel(loadSessionsUseCase)

        // Check that data were loaded correctly
        assertEquals(LiveDataTestUtil.getValue(viewModel.sessions)?.size, testData.size)
        assertEquals(LiveDataTestUtil.getValue(viewModel.numberOfSessions), testData.size)
        assertEquals(LiveDataTestUtil.getValue(viewModel.sessions)?.get(0), testData[0])
    }

    @Test
    fun exceptionHappensInUseCase_ErrorIsHandled() {
        // Create ViewModel with the failing use case
        val viewModel = ScheduleViewModel(createExceptionUseCase())

        // Check that the exception was handled correctly
        assertTrue(LiveDataTestUtil.getValue(viewModel.sessions)?.isEmpty() ?: false)
        assertEquals(LiveDataTestUtil.getValue(viewModel.numberOfSessions), 0)
    }

    /**
     * Creates a use case that will return the provided list of sessions.
     */
    private fun createUseCase(sessions: List<Session>): LoadSessionsUseCase {
        return object: LoadSessionsUseCase(SessionRepository(TestSessionDataSource)) {
            override fun execute(parameters: String): List<Session> {
                return sessions
            }
        }
    }

    /**
     * Creates a use case that throws an exception.
     */
    private fun createExceptionUseCase(): LoadSessionsUseCase {
        return object: LoadSessionsUseCase(SessionRepository(TestSessionDataSource)) {
            override fun execute(parameters: String): List<Session> {
                throw Exception("Testing exception")
            }
        }
    }

}