package com.example.pizzadeliverypet.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.databinding.FragmentLoginBinding
import com.example.pizzadeliverypet.ui.viewModels.LogInViewModel


class MainActivity : AppCompatActivity() {

    lateinit var binding: FragmentLoginBinding
    private val viewModel: LogInViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentLoginBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        /*
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
         */

        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.LogInButton.setOnClickListener(){
            if (viewModel.checkLogin()) {
                val intent = Intent(this, BaseActivity::class.java)
                startActivity(intent)
            }
            else{
                binding.EmailInput.error = viewModel.ErrorTextEmail.value.toString()
            }
        }
    }
}