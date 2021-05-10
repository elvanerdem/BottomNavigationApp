package com.elvanerdem.bottomnavigationapp.ui.tvseriesdetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationapp.R


class TVSeriesDetailFragment : Fragment() {

    private lateinit var tvSeriesDetailViewModel: TVSeriesDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tvSeriesDetailViewModel = ViewModelProvider(this).get(TVSeriesDetailViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tv_series_detail, container, false)
        val textView: TextView = root.findViewById(R.id.text_tv_series_details)
        tvSeriesDetailViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        val button: Button = root.findViewById(R.id.navigateButton)
        button.setOnClickListener {
            findNavController().navigate(TVSeriesDetailFragmentDirections.actionTVSeriesDetailFragmentToTVSeriesOtherDetailFragment())
        }
        return root
    }

}