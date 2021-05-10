package com.elvanerdem.bottomnavigationapp.ui.watchlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.bottomnavigationapp.R

class WatchListFragment : Fragment() {

    private lateinit var watchListViewModel: WatchListViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        watchListViewModel =
            ViewModelProvider(this).get(WatchListViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_watch_list, container, false)
        val textView: TextView = root.findViewById(R.id.text_watch_list)
        watchListViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}