package com.google.samples.app.iosched.shared.model

data class Room(

    /**
     * Unique string identifying this room.
     */
    val id: String,

    /**
     * The name of the room.
     */
    val name: String,

    /**
     * The number of attendees a room can hold.
     */
    val capacity: Int
)