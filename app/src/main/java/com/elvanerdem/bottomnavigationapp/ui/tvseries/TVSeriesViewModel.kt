package com.elvanerdem.bottomnavigationapp.ui.tvseries

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TVSeriesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is TV Series Fragment"
    }
    val text: LiveData<String> = _text
}