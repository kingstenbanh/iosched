package com.google.samples.app.iosched.ui.schedule

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.samples.app.iosched.model.TestData
import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.shared.data.tag.TagRepository
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay
import com.google.samples.app.iosched.util.LiveDataTestUtil
import com.google.samples.app.iosched.util.SyncTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
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
        // Create test use cases with test data
        val loadSessionsUseCase = createSessionsUseCase(TestData.sessionsMap)
        val loadTagsUseCase = createTagsUseCase(TestData.tagsList)

        // Create ViewModel with the use cases
        val viewModel = ScheduleViewModel(loadSessionsUseCase, loadTagsUseCase)

        // Check that data were loaded correctly
        // Sessions
        for (day in ConferenceDay.values()) {
            assertEquals(
                TestData.sessionsMap[day],
                LiveDataTestUtil.getValue(viewModel.getSessionsForDay(day))
            )
        }
        assertFalse(LiveDataTestUtil.getValue(viewModel.isLoading)!!)

        // Tags
        assertEquals(TestData.tagsList, LiveDataTestUtil.getValue(viewModel.tags))
    }

    @Test
    fun testDataIsLoaded_Fails() {
        val loadSessionsUseCase = createSessionsExceptionUseCase()
        val loadTagsUseCase = createTagsExceptionUseCase()

        // Create ViewModel with the use case
        val viewModel = ScheduleViewModel(loadSessionsUseCase, loadTagsUseCase)

        assertTrue(!LiveDataTestUtil.getValue(viewModel.errorMessage).isNullOrEmpty())
    }

    /**
     * Creates a use case that will return the provided list of sessions.
     */
    private fun createSessionsUseCase(
        sessions: Map<ConferenceDay, List<Session>>
    ): LoadSessionsByDayUseCase {
        return object: LoadSessionsByDayUseCase(SessionRepository(TestSessionDataSource())) {
            override fun execute(parameters: SessionFilters): Map<ConferenceDay, List<Session>> {
                return sessions
            }
        }
    }

    /**
     * Creates a use case that throws an exception.
     */
    private fun createSessionsExceptionUseCase(): LoadSessionsByDayUseCase {
        return object : LoadSessionsByDayUseCase(SessionRepository(TestSessionDataSource())) {
            override fun execute(parameters: SessionFilters): Map<ConferenceDay, List<Session>> {
                throw Exception("Testing exception")
            }
        }
    }

    /**
     * Creates a use case that will return the provided list of tags.
     */
    private fun createTagsUseCase(tags: List<Tag>): LoadTagsByCategoryUseCase {
        return object : LoadTagsByCategoryUseCase(TagRepository(TestSessionDataSource())) {
            override fun execute(parameters: Unit): List<Tag> {
                return tags
            }
        }
    }
    /**
     * Creates a use case that throws an exception.
     */
    private fun createTagsExceptionUseCase(): LoadTagsByCategoryUseCase {
        return object : LoadTagsByCategoryUseCase(TagRepository(TestSessionDataSource())) {
            override fun execute(parameters: Unit): List<Tag> {
                throw Exception("Testing exception")
            }
        }
    }
}