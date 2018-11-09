package com.google.samples.app.iosched.shared.data.tag

import com.google.samples.app.iosched.shared.util.ConferenceDataJsonParser

/**
 * Returns data loaded from a local JSON file for development and testing.
 */
object FakeTagDataSource : TagDataSource {
    override fun getTags() = ConferenceDataJsonParser.getTags()
}