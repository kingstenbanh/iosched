package com.google.samples.app.iosched.shared.model

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.not
import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.`is` as Is

class TagTest {

    val androidTagId1 = Tag("1", "TRACK", 0, "Android", 0xFFAED581.toInt())
    val androidTagId2 = Tag("2", "TRACK", 0, "Android", 0xFFAED581.toInt())
    val webTagId2 = Tag("2", "TRACK", 1, "Web", 0xFFFFF176.toInt())

    @Test
    fun tag_differentId_notEqual() {
        assertThat(androidTagId1, Is(not(equalTo(webTagId2))))
    }

    @Test
    fun tag_sameId_equal() {
        assertThat(androidTagId2, Is(equalTo(webTagId2)))
    }

    @Test
    fun tag_sameIdDifferentContent_equal() {
        assertThat(androidTagId2, Is(equalTo(webTagId2)))
    }
}