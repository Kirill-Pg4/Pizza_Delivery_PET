package com.example.pizzadeliverypet.data.models

import android.widget.ImageView
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "DisheModel")
data class Dish(
    @PrimaryKey(autoGenerate = true) val id: Int ,
    val DishesImg: Int,
    val DishesName: String,
    val DishesShortDescribe: String,
    val DishesProp : String,
    val DishPrice : String,
    val DishGram : String
)
