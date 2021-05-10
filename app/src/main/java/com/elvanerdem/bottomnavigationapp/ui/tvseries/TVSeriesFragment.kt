package com.elvanerdem.bottomnavigationapp.ui.tvseries

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

class TVSeriesFragment : Fragment() {

    private lateinit var tvSeriesViewModel: TVSeriesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tvSeriesViewModel =
            ViewModelProvider(this).get(TVSeriesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tv_series, container, false)
        val textView: TextView = root.findViewById(R.id.text_tv_series)
        tvSeriesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val button: Button = root.findViewById(R.id.navigateButton)
        button.setOnClickListener {
            findNavController().navigate(TVSeriesFragmentDirections.actionNavigationTvSeriesToTVSeriesDetailFragment())
        }
        return root
    }
}