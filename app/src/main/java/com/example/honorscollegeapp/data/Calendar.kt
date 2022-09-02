package com.example.honorscollegeapp.data

/* Main calendar */
data class Calendar(
    val summary: String,
    val updated: String,
    val timeZone: String,
    val items: List<CalendarEvent>
)