package com.example.pizzadeliverypet.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts.Intents.UI
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth;
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        auth = Firebase.auth
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        if (auth.currentUser != null){
            val intent = Intent(this, BaseActivity::class.java)
            startActivity(intent)
        }

        binding.LogInButton.setOnClickListener{

            if (!binding.EmailInput.text.toString().isEmpty() && !binding.PasswordInput.text.toString().isEmpty()
            ) {
                val email = binding.EmailInput.text.toString()
                val password = binding.PasswordInput.text.toString()
                Log.d("Fire", "$email , $password")
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val intent = Intent(this, BaseActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(
                                baseContext,
                                "Authentication failed.",
                                Toast.LENGTH_SHORT,
                            ).show()
                        }
                    }
            }
            else {
                Toast.makeText(
                    baseContext,
                    "Please, input valid data",
                    Toast.LENGTH_SHORT,
                ).show()
            }
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