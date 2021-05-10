package com.elvanerdem.bottomnavigationapp.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MoviesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Movies Fragment"
    }
    val text: LiveData<String> = _text
}