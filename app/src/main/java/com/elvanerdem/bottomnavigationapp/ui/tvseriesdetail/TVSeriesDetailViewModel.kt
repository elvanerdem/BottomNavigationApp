package com.elvanerdem.bottomnavigationapp.ui.tvseriesdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TVSeriesDetailViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is TV Series Detail Fragment"
    }
    val text: LiveData<String> = _text
}