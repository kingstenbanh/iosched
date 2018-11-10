package com.google.samples.app.iosched.shared.util.testdata

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.samples.app.iosched.shared.model.Tag
import java.lang.reflect.Type

/**
 * Deserializer for [Tag]s.
 */
class TagDeserializer: JsonDeserializer<Tag> {

    override fun deserialize(
        json: JsonElement?,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): Tag {
        val obj = json?.asJsonObject!!

        return Tag(
            id = obj.get("tag").asString,
            category = obj.get("category").asString,
            orderInCategory = obj.get("order_in_category")?.asInt ?: 999,
            color = parseColor(obj.get("color")?.asString),
            name = obj.get("name").asString
        )
    }
}