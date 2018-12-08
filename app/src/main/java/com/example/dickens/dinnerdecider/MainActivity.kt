package com.example.dickens.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Chinese", "Hamburger", "Mc Donalds", "Pizza","Barrows Pizza")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDecide.setOnClickListener{
            val random = Random()
            val randFood = random.nextInt(foodList.count())
            selectedFood.text = foodList[randFood]
        }
        btnFood.setOnClickListener {
            val newFood = txtFood.text.toString()
            foodList.add(newFood)
            txtFood.text.clear()
        }

    }
}
