package com.example.honorscollegeapp.data

import java.io.Serializable

/* Internal use */
data class CalendarEvent(
    val id: String,
    val created: String,
    val updated: String,
    val summary: String,
    val description: String,
    val location: String,
    val start: CalendarStart,
    val end: CalendarEnd
) : Serializable

data class CalendarStart(
    val dateTime: String,
    val timeZone: String,
)
data class CalendarEnd(
    val dateTime: String,
    val timeZone: String,
)
