package net.dobnikar.theapp.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.dobnikar.thelib2.LibTagsProvider

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = LibTagsProvider.tags().toString()
    }
    val text: LiveData<String> = _text
}
