package com.google.samples.app.iosched.shared.usecases.repository

import com.google.samples.app.iosched.shared.data.tag.TagDataSource
import com.google.samples.app.iosched.shared.model.Tag

/**
 * Generates dummy tag data to be used in tests.
 */
object TestTagDataSource : TagDataSource {
    private val androidTag = Tag("1", "TRACK", 0, "Android", 0xFFAED581.toInt())
    private val webTag = Tag("2", "TRACK", 1, "Web", 0xFFFFF176.toInt())
    private val sessionsTag = Tag("101", "TYPE", 0, "Sessions", 0)
    private val codelabsTag = Tag("102", "TYPE", 1, "Codelabs", 0)
    private val beginnerTag = Tag("201", "LEVEL", 0, "Beginner", 0)
    private val intermediateTag = Tag("202", "LEVEL", 1, "Intermediate", 0)

    override fun getTags() =
        listOf(
            androidTag,
            webTag,
            sessionsTag,
            codelabsTag,
            beginnerTag,
            intermediateTag
        )
}