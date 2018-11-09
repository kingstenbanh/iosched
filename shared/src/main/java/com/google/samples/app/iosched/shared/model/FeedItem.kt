package com.google.samples.app.iosched.shared.model

import android.support.annotation.ColorInt
import org.threeten.bp.ZonedDateTime

/**
 * Describes an item in the feed, displaying social-media like updates.
 * Each item includes a message, id, a title and a timestamp.
 * Optionally, it can also include an image and a category with a color.
 * An item can also be marked as priority.
 */
data class FeedItem(
    /**
     * Unique string identifying this item.
     */
    val id: String,
    /**
     * Title of this feed item.
     */
    val title: String,
    /**
     * Message of this feed item.
     */
    val message: String,
    /**
     * Marks this feed item as a priority.
     */
    val priority: Boolean,
    /**
     * Timestamp this feed item was posted at.
     */
    val timestamp: ZonedDateTime,
    /**
     * File name of the image.
     */
    val imageFilename: String,
    /**
     * Item category. Free form string.
     */
    val category: String,
    /**
     * The color associated with this item.
     */
    @ColorInt val color: Int
)