package com.example.pizzadeliverypet.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.data.models.database_seed
import com.example.pizzadeliverypet.data.models.database_seed.OrderLi
import com.example.pizzadeliverypet.data.models.database_seed.standardPositionPizza
import com.example.pizzadeliverypet.databinding.FragmentBasketBinding
import com.example.pizzadeliverypet.databinding.FragmentMenuBinding
import com.example.pizzadeliverypet.other.DishesAdapter
import com.example.pizzadeliverypet.other.DishesBasketAdpter


class BasketFragment : Fragment() {

    lateinit var binding: FragmentBasketBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBasketBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.OrderButton.setOnClickListener{
            findNavController().navigate(R.id.action_basketFragment_to_bottomSheetFragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.recyclerView2
        recyclerView.adapter = DishesBasketAdpter(OrderLi)
        recyclerView.layoutManager = LinearLayoutManager(context)
        //val bottomNavView = binding.bottomNavigationView
        //val navController = findNavController(R.id.)

    }


    override fun onPause() {
        super.onPause()
        Log.d("Fragments", "Fragments Basket on Pause")
    }

    override fun onResume() {
        super.onResume()
        //recyclerView.adapter = DishesBasketAdpter(OrderLi)
        //recyclerView.adapter = DishesBasketAdpter(listOf(standardPositionPizza[1]))
        Log.d("Fragments", "Fragments Basket on Resume")

    }

}





