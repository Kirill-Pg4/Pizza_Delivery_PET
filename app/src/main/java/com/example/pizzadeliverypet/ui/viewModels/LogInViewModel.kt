package com.example.pizzadeliverypet.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.io.Closeable

class LogInViewModel : ViewModel() {

    private var _login : String = ""
    var login : String = ""
        get() = _login

    private val _password : String = ""
    val password : String
        get() = _password

    private var _ErrorEnabled : Boolean = false
    var ErrorEnabled : Boolean = false
        get() = _ErrorEnabled

   /* fun checkLogin(): Boolean{
        var fin = ErrorEnabled
        if (login.contains('@')){
            _login = login
            _ErrorEnabled = false

        }

    }
    */
}