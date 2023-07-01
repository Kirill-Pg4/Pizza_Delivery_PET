package com.example.pizzadeliverypet.other

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzadeliverypet.data.models.Dish
import com.example.pizzadeliverypet.data.models.database_seed.OrderLi
import com.example.pizzadeliverypet.data.models.database_seed.standardPositionDrinks
import com.example.pizzadeliverypet.databinding.FragmentBasketBinding
import com.example.pizzadeliverypet.databinding.FragmentDishItemBinding
import com.example.pizzadeliverypet.databinding.FragmentItemBasketBinding

class DishesBasketAdpter(private val data: MutableList<Dish>) : RecyclerView.Adapter<DishesBasketAdpter.MyViewHolder>() {
    inner class MyViewHolder(private val binding: FragmentItemBasketBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Dish) {
            binding.DishesImage.setImageResource(item.DishesImg)
            binding.DishesName.text = item.DishesName
            binding.DishesProp.text = item.DishesProp
            binding.DishesShortDescribe.text = item.DishesShortDescribe
            binding.countOrd.text = item.count.toString()
            binding.MinusBut.setOnClickListener{
                if (item.count > 0){
                    item.count--
                    notifyDataSetChanged()
                }
            }
            binding.PlusBut.setOnClickListener{
                if (item.count >= 0 && item.count < 10){
                    item.count++
                    notifyDataSetChanged()
                }
            }
            binding.DeleteButton.setOnClickListener{
                OrderLi.remove(item)
                notifyDataSetChanged()
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishesBasketAdpter.MyViewHolder {
        val binding = FragmentItemBasketBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DishesBasketAdpter.MyViewHolder, position: Int) {
        val item = data[position]
        item?.let { holder.bind(it) }

    }

    override fun getItemCount() = data.size

}