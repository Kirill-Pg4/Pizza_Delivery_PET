package com.example.pizzadeliverypet.other

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzadeliverypet.data.models.Dish
import com.example.pizzadeliverypet.data.models.database_seed.OrderLi
import com.example.pizzadeliverypet.databinding.FragmentDishItemBinding
import kotlin.math.log


class DishesAdapter(private val data: List<Dish>) : RecyclerView.Adapter<DishesAdapter.MyViewHolder>() {

    interface ItemClickListener {
        fun onButtonClick(dish: Dish)
    }

    inner class MyViewHolder(private val binding: FragmentDishItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Dish) {
            binding.id.text = item.id.toString()
            binding.DishesImage.setImageResource(item.DishesImg)
            binding.DishesName.text = item.DishesName
            binding.DishesProp.text = item.DishesProp
            binding.DishesShortDescribe.text = item.DishesShortDescribe
            binding.DishesGram.text = item.DishGram
            binding.DishesPrice.text = item.DishPrice.toString()+"$"
            binding.dishL = item
            binding.BuyButton.setOnClickListener {
                if(OrderLi.contains(item)){
                    item.count++
                }
                else {
                    OrderLi.add(item)
                    Log.d("Adapter", "Loaded \n $OrderLi")
                }
            }
        }
        /*
        init {
            binding.BuyButton.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val dish = OrderLi[position]
                    OrderLi.add(dish)
                }
            }
        }*/
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

