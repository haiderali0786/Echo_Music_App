package com.example.musicapp.fragments

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.musicapp.R



class AboutUsFragment : Fragment() {
    var aboutUs: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    @Nullable
    override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_about_us, container, false)
        activity?.title = "About us"
        aboutUs = view.findViewById(R.id.about_us_text) as TextView
        (aboutUs as TextView).text = "This app is made by Android Developer Haider Ali as part of developing the project."

        return view
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        val item = menu.findItem(R.id.action_sort)
        if (item == null) {
        } else {
            item.isVisible = false
        }
    }
}