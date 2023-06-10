package com.example.pizzadeliverypet.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.data.list2
import com.example.pizzadeliverypet.databinding.FragmentMenuBinding
import com.example.pizzadeliverypet.other.DishesAdapter

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
        recyclerView.adapter = DishesAdapter(list2)
        recyclerView.layoutManager = LinearLayoutManager(context)


    }


}