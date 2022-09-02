package com.example.honorscollegeapp.util

// 2022-02-15T11:45:00-08:00

fun HonorsUtilsDate(startDateTime: String): String {
    val dateArray = startDateTime.split("-", "T", ":").toTypedArray()
    return dateArray[1]+"/"+dateArray[2]
}

fun HonorsUtilsTime(startDateTime: String): String {
    val dateArray = startDateTime.split("-", "T", ":").toTypedArray()
    return dateArray[4] + ":" + dateArray[5]
}