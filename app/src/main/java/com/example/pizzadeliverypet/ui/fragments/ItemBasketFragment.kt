package com.example.pizzadeliverypet.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.databinding.FragmentItemBasketBinding
import com.example.pizzadeliverypet.databinding.FragmentItemBasketBindingImpl

class ItemBasketFragment : Fragment() {

    lateinit var binding: FragmentItemBasketBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_item_basket,container,false)
        return binding.root
    }




}