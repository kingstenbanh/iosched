package com.google.samples.app.iosched.ui.schedule

import com.google.samples.app.iosched.shared.model.Tag

class SessionFilters {

    private val filteredTags = HashSet<Tag>()

    fun remove(tag: Tag) = filteredTags.remove(tag)

    fun add(vararg tags: Tag) {
        filteredTags.addAll(tags)
    }

    fun clearAll() = filteredTags.clear()

    fun getCategoryCount() = filteredTags.distinctBy { it.category }.size

    fun hasAnyFilters() = filteredTags.isNotEmpty()

    /**
     * There are different types of tag categories. Only filter if there are tags in each
     * category.
     */
    fun matchesSessionTags(sessionTags: List<Tag>): Boolean {
        var match = true
        filteredTags.groupBy { it.category }.forEach { category, tagsInCategory ->
            if (sessionTags.intersect(tagsInCategory).isEmpty()) {
                match = false
                return@forEach
            }
        }
        return match
    }
}