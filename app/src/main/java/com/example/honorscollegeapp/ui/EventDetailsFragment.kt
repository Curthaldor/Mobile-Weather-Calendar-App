package com.example.honorscollegeapp.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.honorscollegeapp.R
import com.example.honorscollegeapp.util.HonorsUtilsDate
import com.example.honorscollegeapp.util.HonorsUtilsTime

class EventDetailsFragment : Fragment(R.layout.page_event_detail) {
    private val args: EventDetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val date = HonorsUtilsDate(args.event.start.dateTime)
        val time = HonorsUtilsTime(args.event.end.dateTime)

//        view.findViewById<TextView>(R.id.tv_event_title).text = args.event.summary
        view.findViewById<TextView>(R.id.tv_desc).text = args.event.description
        view.findViewById<TextView>(R.id.tv_event_location).text = args.event.location
        view.findViewById<TextView>(R.id.tv_date).text = date
        view.findViewById<TextView>(R.id.tv_time).text = time
    }
}