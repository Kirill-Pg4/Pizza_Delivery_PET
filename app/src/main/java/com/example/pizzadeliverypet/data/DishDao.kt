package com.example.pizzadeliverypet.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pizzadeliverypet.data.models.Dish

@Dao
interface DishDao {
    @Query("SELECT * FROM dishemodel")
    fun getAllDishes(): LiveData<List<Dish>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDish(dish: Dish)

    @Delete
    suspend fun deleteDish(dish: Dish)
}
