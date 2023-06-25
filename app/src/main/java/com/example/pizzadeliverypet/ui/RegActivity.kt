package com.example.pizzadeliverypet.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.databinding.ActivityRegBinding
import com.example.pizzadeliverypet.databinding.FragmentItemBasketBinding
import com.example.pizzadeliverypet.ui.viewModels.LogInViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth;
    private val viewModel: LogInViewModel by viewModels()
    lateinit var binding: ActivityRegBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegBinding.inflate(layoutInflater)
        auth = Firebase.auth
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()


        binding.AddingText.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



        binding.RegButton.setOnClickListener {
            if(!binding.EmailInput.text.toString().isEmpty() && !binding.PasswordInput.text.toString().isEmpty()) {
                val email = binding.EmailInput.text.toString()
                val password = binding.PasswordInput.text.toString()
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(
                                baseContext,
                                "Registration failed.",
                                Toast.LENGTH_SHORT,
                            ).show()
                        }
                    }
            }
            else{
                Toast.makeText(
                    baseContext,
                    "Please, input valid data",
                    Toast.LENGTH_SHORT,
                ).show()
            }
        }
    }

}