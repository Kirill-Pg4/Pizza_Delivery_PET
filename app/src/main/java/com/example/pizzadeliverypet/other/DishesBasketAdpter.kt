package com.example.pizzadeliverypet.other

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzadeliverypet.data.models.Dish
import com.example.pizzadeliverypet.databinding.FragmentBasketBinding
import com.example.pizzadeliverypet.databinding.FragmentDishItemBinding
import com.example.pizzadeliverypet.databinding.FragmentItemBasketBinding

class DishesBasketAdpter(private val data: List<Dish>) : RecyclerView.Adapter<DishesBasketAdpter.MyViewHolder>() {
    inner class MyViewHolder(private val binding: FragmentItemBasketBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Dish) {
            binding.DishesImage.setImageResource(item.DishesImg)
            binding.DishesName.text = item.DishesName
            binding.DishesProp.text = item.DishesProp
            binding.DishesShortDescribe.text = item.DishesShortDescribe
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishesBasketAdpter.MyViewHolder {
        val binding = FragmentItemBasketBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DishesBasketAdpter.MyViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

}