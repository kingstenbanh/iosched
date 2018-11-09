package com.google.samples.app.iosched.shared.util

import org.junit.Assert.assertEquals
import org.junit.Test

class ColorUtilsTest {

    @Test
    fun parseHexColor_withAlpha() {
        assertEquals(0x8033b5e5L.toInt(), ColorUtils.parseHexColor("#8033b5e5"))
    }
    @Test
    fun parseHexColor_withoutAlpha() {
        assertEquals(0xff33b5e5L.toInt(), ColorUtils.parseHexColor("#33b5e5"))
    }
    @Test(expected = IllegalArgumentException::class)
    fun parseHexColor_emptyString() {
        ColorUtils.parseHexColor("")
    }
    @Test(expected = IllegalArgumentException::class)
    fun parseHexColor_noHashSymbol() {
        ColorUtils.parseHexColor("000000")
    }
    @Test(expected = NumberFormatException::class)
    fun parseHexColor_invalidHex() {
        ColorUtils.parseHexColor("#D0GF00D1")
    }
}