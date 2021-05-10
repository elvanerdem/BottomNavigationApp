package com.elvanerdem.bottomnavigationapp.ui.moviesdetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.bottomnavigationapp.R

class MovieDetailsFragment : Fragment() {

    private lateinit var movieDetailsViewModel: MovieDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        movieDetailsViewModel = ViewModelProvider(this).get(MovieDetailsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_movie_details, container, false)
        val textView: TextView = root.findViewById(R.id.text_movie_details)
        movieDetailsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

}