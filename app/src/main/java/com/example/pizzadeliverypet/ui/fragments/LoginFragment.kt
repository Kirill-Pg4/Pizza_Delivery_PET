package com.example.pizzadeliverypet.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.databinding.FragmentLoginBinding
import com.example.pizzadeliverypet.ui.BaseActivity
import com.example.pizzadeliverypet.ui.viewModels.LogInViewModel


class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding
    private val viewModel: LogInViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.LogInButton.setOnClickListener(){
            if (viewModel.checkLogin()) {
                //findNavController().navigate(R.id.action_loginFragment_to_menuFragment)
            }
            else{
                binding.EmailInput.error = viewModel.ErrorTextEmail.value.toString()
            }
        }
    }


}