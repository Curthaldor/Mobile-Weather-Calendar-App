package com.example.honorscollegeapp.data

/* Main calendar */
data class Calendar(
    val summary: String,
    val updated: String,
    val timeZone: String,
    val items: List<CalendarEvent>
)

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
)

data class CalendarStart(
    val dateTime: String,
    val timeZone: String,
)
data class CalendarEnd(
    val dateTime: String,
    val timeZone: String,
)
