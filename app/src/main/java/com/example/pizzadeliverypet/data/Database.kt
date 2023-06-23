package com.example.pizzadeliverypet.data

import android.content.Context
import android.widget.Adapter
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.data.models.Dish
import com.example.pizzadeliverypet.data.models.database_seed


@Database(entities = [Dish::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): DishDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "DishDatabase"
                )
                    .createFromAsset("database_seed.standardPositionBurger")
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}

