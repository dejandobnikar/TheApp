package net.dobnikar.theapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.dobnikar.thelib1.LibFeatureProvider

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = LibFeatureProvider.features().toString()
    }
    val text: LiveData<String> = _text
}
