package com.example.pizzadeliverypet.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Index
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.data.models.Dish
import com.example.pizzadeliverypet.data.models.database_seed
import com.example.pizzadeliverypet.data.models.database_seed.OrderLi
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

    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragments", "Fragments Menu on Pause")
    }

    override fun onResume() {
        super.onResume()
        binding.recyclerView.setOnClickListener{

                Log.d("Parker", "2Added: ${database_seed.OrderLi}")
                //database_seed.OrderLi.add(Dish(binding.id.toString().toInt(),binding.DishesImage.id,binding.DishesName.text.toString(),binding.DishesShortDescribe.text.toString(),binding.DishesProp.text.toString(),binding.DishesPrice.text.toString(),binding.DishesGram.text.toString()))

        }
        Log.d("Fragments", "Fragments Menu on Resume")

    }
    /*
    override fun onItemClick(dish: Dish) {
        // Добавьте нажатый элемент в MutableList
        OrderLi.add(dish)
        // Уведомите адаптер об изменении данных
        binding.recyclerView.adapter?.notifyDataSetChanged()
    }
*/




}