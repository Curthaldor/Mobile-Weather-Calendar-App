package com.example.honorscollegeapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.honorscollegeapp.R
import com.example.honorscollegeapp.data.Calendar
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

const val GOOGLE_API_KEY = "AIzaSyDjwke8tWWu_-CSsA7pev_G8OqTALsaAKs"

class MainActivity : AppCompatActivity() {
    private lateinit var requestQueue: RequestQueue
    private val apiBaseUrl = "https://www.googleapis.com/"
    private val calendarId = "dlme32b3csk7fjb1dpn9nhv5g8@group.calendar.google.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestQueue = Volley.newRequestQueue(this)
        doCalendarSearch(this.calendarId)
    }

    private fun doCalendarSearch(calendarId: String){
        val url =
            "${apiBaseUrl}calendar/v3/calendars/${calendarId}/events?key=$GOOGLE_API_KEY"

        val moshi = Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
        val jsonAdapter: JsonAdapter<Calendar> =
            moshi.adapter(Calendar::class.java)

        val req = StringRequest(
            Request.Method.GET,
            url,
            {
                Log.d("MainActivity", it)
                val results = jsonAdapter.fromJson(it)
            },
            {
                Log.d(
                    "MainActivity",
                    "Error fetching from $url: ${it.message}"
                )
            }
        )
        requestQueue.add(req);
    }
}