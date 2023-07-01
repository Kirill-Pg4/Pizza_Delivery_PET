package com.example.pizzadeliverypet.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.graphics.convertTo
import androidx.navigation.fragment.findNavController
import com.example.pizzadeliverypet.R
import com.example.pizzadeliverypet.data.models.database_seed.OrderLi
import com.example.pizzadeliverypet.databinding.FragmentBasketBinding
import com.example.pizzadeliverypet.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.time.LocalTime
import java.util.Calendar
import java.util.TimeZone

class BottomSheetFragment : BottomSheetDialogFragment() {

    var finPrice = 0f
    var finOrder = ""
    val db = Firebase.firestore
    lateinit var binding: FragmentBottomSheetBinding
    val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        calendar.timeZone = TimeZone.getDefault()
        OrderLi.indices.forEach() { i ->
            finPrice += OrderLi[i].DishPrice
            finOrder +=  "\n${OrderLi[i].count.toString()}*" + OrderLi[i].DishesName.toString() + ", "
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        binding.OrderButton.setOnClickListener{

           val order = hashMapOf(
               "Adress" to "${binding.AdressInput.text.toString()}",
               "Phone" to "${binding.PhoneInput.text.toString()}",
               "Price" to "${finPrice}",
               "Order" to "$finOrder",
               "Time of Ordered" to "${calendar.time.toString()}"
            )
            if(!binding.AdressInput.text.toString().isEmpty() && !binding.PhoneInput.text.toString().isEmpty()) {
                db.collection("orders")
                    .add(order)
                    .addOnSuccessListener { documentReference ->
                        Toast.makeText(context,"Thank`s for your order!",Toast.LENGTH_SHORT).show()
                        findNavController().navigate(R.id.action_bottomSheetFragment_to_menuFragment)
                        Log.d("Firebase", "DocumentSnapshot added with ID: ${documentReference.id}")
                        OrderLi.clear()
                    }
                    .addOnFailureListener { e ->
                        Log.w("Firebase", "Error adding document", e)
                    }
            }
        }
        binding.FinallPrice.text = finOrder.toString() + "= " + finPrice.toString() + "$"
    }

}