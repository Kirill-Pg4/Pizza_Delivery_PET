package com.example.pizzadeliverypet.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.data.models.database_seed
import com.example.pizzadeliverypet.databinding.FragmentMenuBinding
import com.example.pizzadeliverypet.other.DishesAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuFragment : Fragment() {

    lateinit var binding : FragmentMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.recyclerView

        recyclerView.adapter = DishesAdapter(database_seed.standardPositionPizza)


        binding.PizzaButtonGroup.setOnClickListener{
            recyclerView.adapter = null
            recyclerView.adapter = DishesAdapter(database_seed.standardPositionPizza)
        }
        binding.BurgerButtonGroup.setOnClickListener{
            recyclerView.adapter = null
            recyclerView.adapter = DishesAdapter(database_seed.standardPositionBurger)
        }

        binding.DrinksButtonGroup.setOnClickListener{
            recyclerView.adapter = null
            recyclerView.adapter = DishesAdapter(database_seed.standardPositionDrinks)
        }

        recyclerView.layoutManager = LinearLayoutManager(context)
        //val bottomNavView = binding.bottomNavigationView
        //val navController = findNavController(R.id.)

    }




}