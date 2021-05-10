package com.elvanerdem.bottomnavigationapp.ui.moviesdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieDetailsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Movie Details Fragment"
    }
    val text: LiveData<String> = _text

}