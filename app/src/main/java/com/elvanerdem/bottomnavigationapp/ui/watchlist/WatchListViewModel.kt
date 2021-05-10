package com.elvanerdem.bottomnavigationapp.ui.watchlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WatchListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Watch List Fragment"
    }
    val text: LiveData<String> = _text
}