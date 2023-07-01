package com.example.pizzadeliverypet.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.data.models.Dish
import com.example.pizzadeliverypet.data.models.database_seed
import com.example.pizzadeliverypet.data.models.database_seed.OrderLi
import com.example.pizzadeliverypet.data.models.database_seed.standardPositionDrinks
import com.example.pizzadeliverypet.databinding.FragmentDishItemBinding
import com.example.pizzadeliverypet.databinding.FragmentItemBasketBinding


class DishItemFragment : Fragment() {

    lateinit var binding: FragmentDishItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDishItemBinding.inflate(inflater,container,false)
        return binding.root
    }



}
