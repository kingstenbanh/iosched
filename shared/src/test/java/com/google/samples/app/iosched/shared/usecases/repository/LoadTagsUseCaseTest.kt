package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.data.tag.TagRepository
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.result.Result.Success
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * TODO: placeholder/example for use cases.
 */
class LoadTagsUseCaseTest {
    @Test
    fun returnsListOfTags() {
        val loadTagsUseCase = LoadTagsUseCase(TagRepository(TestSessionDataSource))
        val tags: Result.Success<List<Tag>> =
            loadTagsUseCase.
                executeNow(Unit) as Success<List<Tag>>
        assertEquals(tags.data, TagRepository(TestSessionDataSource).getTags())
    }
}