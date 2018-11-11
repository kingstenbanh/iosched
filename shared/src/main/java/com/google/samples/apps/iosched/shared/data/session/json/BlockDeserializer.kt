package com.google.samples.apps.iosched.shared.data.session.json

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.samples.apps.iosched.shared.model.Block
import org.threeten.bp.ZonedDateTime
import java.lang.reflect.Type
/**
 * Deserializer for blocks. Returns a [Block] object.
 */
class BlockDeserializer : JsonDeserializer<Block> {
    override fun deserialize(
        json: JsonElement?,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): Block {
        val obj = json?.asJsonObject!!
        val color = parseColor(obj.get("color")?.asString)
        val strokeColorStr = obj.get("strokeColor")?.asString
        val strokeColor = if (strokeColorStr != null) {
            parseColor(strokeColorStr)
        } else {
            color
        }

        return Block(
            title = obj.get("title").asString,
            type = obj.get("type").asString,
            color = color,
            isDark = obj.get("isDark")?.asBoolean ?: false,
            strokeColor = strokeColor,
            startTime = ZonedDateTime.parse(obj.get("start").asString),
            endTime = ZonedDateTime.parse(obj.get("end").asString)
        )
    }
}