package com.example.pizzadeliverypet.other

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzadeliverypet.data.models.Dish
import com.example.pizzadeliverypet.databinding.FragmentDishItemBinding


class DishesAdapter(private val data: List<Dish>) : RecyclerView.Adapter<DishesAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val binding: FragmentDishItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Dish) {
            binding.DishesImage.setImageResource(item.DishesImg)
            binding.DishesName.text = item.DishesName
            binding.DishesProp.text = item.DishesProp
            binding.DishesShortDescribe.text = item.DishesShortDescribe
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = FragmentDishItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

}

