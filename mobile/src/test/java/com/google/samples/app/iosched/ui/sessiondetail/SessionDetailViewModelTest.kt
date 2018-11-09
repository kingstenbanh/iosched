@file:Suppress("FunctionName")

package com.google.samples.app.iosched.ui.sessiondetail

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.samples.app.iosched.model.TestData
import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.usecases.repository.LoadSessionUseCase
import com.google.samples.app.iosched.test.util.LiveDataTestUtil
import com.google.samples.app.iosched.test.util.SyncTaskExecutorRule
import com.google.samples.app.iosched.ui.schedule.TestSessionDataSource
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Unit tests for the [SessionDetailViewModel].
 */
class SessionDetailViewModelTest {

    // Executes tasks in the Architecture Components in the same thread
    @get:Rule var instantTaskExecutorRule = InstantTaskExecutorRule()

    // Executes tasks in a synchronous [TaskScheduler]
    @get:Rule var syncTaskExecutorRule = SyncTaskExecutorRule()

    private lateinit var viewModel: SessionDetailViewModel
    private val testSession = TestData.session0

    @Before fun setup() {
        viewModel = SessionDetailViewModel(createUseCase(testSession))
        viewModel.loadSessionById(testSession.id)
    }

    @Test fun testDataIsLoaded_observablesUpdated() {
        assertEquals(testSession, LiveDataTestUtil.getValue(viewModel.session))
    }

    /**
     * Creates a use case that will return the provided session.
     */
    private fun createUseCase(session: Session): LoadSessionUseCase {
        return object : LoadSessionUseCase(SessionRepository(TestSessionDataSource())) {
            override fun execute(parameters: String) = session
        }
    }
}