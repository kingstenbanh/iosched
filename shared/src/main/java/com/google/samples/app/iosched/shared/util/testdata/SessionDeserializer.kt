package com.google.samples.app.iosched.shared.util.testdata

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import org.threeten.bp.ZonedDateTime
import java.lang.reflect.Type

class SessionDeserializer : JsonDeserializer<SessionTemp> {

    override fun deserialize(
        json: JsonElement?,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): SessionTemp {
        val obj = json?.asJsonObject!!
        val tags: List<String> = getListFromJsonArray(obj, "tags")
        val speakers = getListFromJsonArray(obj, "speakers")

        return SessionTemp(
            id = obj.get("id").asString,
            sessionUrl = obj.get("url").asString,
            title = obj.get("title").asString,
            startTime = ZonedDateTime.parse(obj.get("startTimestamp").asString),
            endTime = ZonedDateTime.parse(obj.get("endTimestamp").asString),
            abstract = obj.get("description").asString,
            photoUrl = obj.get("photoUrl").asString,
            liveStreamUrl = "",
            speakers = speakers.toSet(),
            tags = tags.toList(),
            relatedSessions = emptySet(),
            youTubeUrl = "",
            room = obj.get("room").asString
        )
    }

    private fun getListFromJsonArray(obj: JsonObject, key: String): List<String> {
        val array = obj.get(key).asJsonArray
        val stringList = ArrayList<String>()
        array.mapTo(stringList) { it.asString }
        return stringList
    }
}