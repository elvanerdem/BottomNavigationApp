package com.elvanerdem.bottomnavigationapp.ui.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationapp.R

class MoviesFragment : Fragment() {

    private lateinit var moviesViewModel: MoviesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        moviesViewModel = ViewModelProvider(this).get(MoviesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_movies, container, false)
        val textView: TextView = root.findViewById(R.id.text_movies)
        moviesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        val button: Button = root.findViewById(R.id.navigateButton)
        button.setOnClickListener {
            findNavController().navigate(MoviesFragmentDirections.actionNavigationMoviesToMovieDetailsFragment())
        }
        return root
    }
}