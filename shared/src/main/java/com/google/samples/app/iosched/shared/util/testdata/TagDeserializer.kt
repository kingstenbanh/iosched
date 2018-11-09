package com.google.samples.app.iosched.shared.util.testdata

import android.graphics.Color
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.util.ColorUtils
import timber.log.Timber
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
        val colorString = obj.get("color")?.asString
        val color = if (colorString != null) {
            try {
                ColorUtils.parseHexColor(colorString)
            } catch (t: Throwable) {
                Timber.d(t, "Failed to parse tag color")
                Color.TRANSPARENT
            }
        } else {
            Color.TRANSPARENT
        }

        return Tag(
            id = obj.get("tag").asString,
            category = obj.get("category").asString,
            orderInCategory = obj.get("order_in_category")?.asInt ?: 999,
            color = color,
            name = obj.get("name").asString
        )
    }
}