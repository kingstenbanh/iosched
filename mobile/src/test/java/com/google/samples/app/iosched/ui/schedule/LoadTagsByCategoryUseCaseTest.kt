package com.google.samples.app.iosched.ui.schedule

import com.google.samples.app.iosched.model.TestData
import com.google.samples.app.iosched.shared.data.tag.TagDataSource
import com.google.samples.app.iosched.shared.data.tag.TagRepository
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.result.Result
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Unit tests for [LoadTagsByCategoryUseCase]
 */
class LoadTagsByCategoryUseCaseTest {
    @Test
    fun returnsOrderedTags() {
        val useCase = LoadTagsByCategoryUseCase(TagRepository(TestSessionDataSource))
        val tags = useCase.executeNow(Unit) as Result.Success<List<Tag>>
        // Expected values to assert
        val expected = listOf(
            // category = LEVEL
            TestData.beginnerTag, TestData.intermediateTag, TestData.advancedTag,
            // category = TRACK
            TestData.androidTag, TestData.webTag,
            // category = TYPE
            TestData.sessionsTag, TestData.codelabsTag
        )
        assertEquals(expected, tags.data)
    }
    object TestSessionDataSource : TagDataSource {
        override fun getTags(): List<Tag> {
            return TestData.tagsList
        }
    }
}