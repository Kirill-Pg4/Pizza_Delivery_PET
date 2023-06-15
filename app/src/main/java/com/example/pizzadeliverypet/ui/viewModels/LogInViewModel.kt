package com.example.pizzadeliverypet.ui.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import java.io.Closeable

class LogInViewModel : ViewModel() {

    private val _email  = MutableLiveData<String>("")
    val email : MutableLiveData<String>
        get() = _email

    private val _password = MutableLiveData<String>("")
    val password : MutableLiveData<String>
        get() = _password

    private val _ErrorEnabled = MutableLiveData<Boolean>(false
    )
    val ErrorEnabled : LiveData<Boolean>
        get() = _ErrorEnabled

    private val _ErrorTextEmail = MutableLiveData<String>("")
    val ErrorTextEmail : MutableLiveData<String>
        get() = _ErrorTextEmail


    fun checkLogin(): Boolean{
        var fin = ErrorEnabled.value
        if (email.value.toString().contains("@")){
            _email.value = email.value
            _ErrorEnabled.value = false
            _ErrorTextEmail.value = ""
            fin = true
        }
        else{
            _ErrorTextEmail.value = "Please, specify a valid Email"
            _ErrorEnabled.value = true
            fin = false
        }
        return fin
    }

}