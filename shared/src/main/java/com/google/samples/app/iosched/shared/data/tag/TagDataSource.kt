package com.google.samples.app.iosched.shared.data.tag

import com.google.samples.app.iosched.shared.model.Tag

interface TagDataSource {
    fun getTags(): List<Tag>
}