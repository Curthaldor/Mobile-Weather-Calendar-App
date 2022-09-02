package com.example.honorscollegeapp.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.honorscollegeapp.R

class EventDetailsFragment : Fragment(R.layout.page_event_detail) {
    private val args: EventDetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.tv_event_title).text = args.event.summary
        view.findViewById<TextView>(R.id.tv_event_description).text = args.event.description
        view.findViewById<TextView>(R.id.tv_event_location).text = args.event.location
        view.findViewById<TextView>(R.id.tv_event_start).text = args.event.start.dateTime
        view.findViewById<TextView>(R.id.tv_event_end).text = args.event.end.dateTime
    }
}