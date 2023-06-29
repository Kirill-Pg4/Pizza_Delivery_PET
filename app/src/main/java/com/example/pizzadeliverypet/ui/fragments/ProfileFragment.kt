package com.example.pizzadeliverypet.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.databinding.FragmentProfileBinding
import com.example.pizzadeliverypet.ui.BaseActivity
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class ProfileFragment : Fragment() {

    lateinit var binding: FragmentProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        val user = Firebase.auth.currentUser
        user?.let {
            // Name, email address, and profile photo Url
            binding.ProfileEmail.text = it.email

            val uid = it.uid
        }

        binding.LogOutButt.setOnClickListener {
            Firebase.auth.signOut()
            activity?.finish()
        }


    }


}