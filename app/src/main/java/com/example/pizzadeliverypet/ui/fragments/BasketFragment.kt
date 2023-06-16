package com.example.pizzadeliverypet.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.databinding.FragmentBasketBinding


class BasketFragment : Fragment() {

    lateinit var binding: FragmentBasketBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBasketBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.OrderButton.setOnClickListener{
            findNavController().navigate(R.id.action_basketFragment_to_bottomSheetFragment)
        }
    }

}