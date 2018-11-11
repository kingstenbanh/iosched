package com.google.samples.apps.iosched.shared.data


import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.greaterThan
import org.hamcrest.Matchers.hasSize
import org.hamcrest.Matchers.not
import org.hamcrest.Matchers.notNullValue
import org.junit.Assert
import org.junit.Test

/**
 * Tests for [BootstrapConferenceDataSource]
 */
class BootstrapConferenceDataSourceTest2 {

    @Test
    fun loadJson_resultIsNotEmpty() {
        val data = BootstrapConferenceDataSource.loadAndParseBootstrapData()
        Assert.assertThat(data.sessions, hasSize(greaterThan(0)))
        Assert.assertThat(data.blocks, hasSize(greaterThan(0)))
        Assert.assertThat(data.rooms, hasSize(greaterThan(0)))
        Assert.assertThat(data.speakers, hasSize(greaterThan(0)))
        Assert.assertThat(data.tags, hasSize(greaterThan(0)))
        Assert.assertThat(data.version, `is`(notNullValue()))
        Assert.assertThat(data.version, `is`(not(0)))
    }
}