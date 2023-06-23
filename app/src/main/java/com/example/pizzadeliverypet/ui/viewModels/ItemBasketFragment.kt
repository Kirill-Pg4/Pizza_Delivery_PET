package com.example.pizzadeliverypet.ui.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemBasketFragment : ViewModel() {

    private val _count = MutableLiveData<String>()
    val count : MutableLiveData<String>
        get() = _count



}