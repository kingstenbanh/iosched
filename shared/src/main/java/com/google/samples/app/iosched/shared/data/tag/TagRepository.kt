package com.google.samples.app.iosched.shared.data.tag

import com.google.samples.app.iosched.shared.model.Tag
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Single point of access to tag data for the presentation layer.
 */
@Singleton
open class TagRepository @Inject constructor(private val dataSource: TagDataSource) {

    fun getTags(): List<Tag> {
        return dataSource.getTags()
    }
}