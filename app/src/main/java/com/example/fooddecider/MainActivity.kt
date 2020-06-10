package com.example.fooddecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    lateinit var txtfood :TextView
    lateinit var  btnnxt : Button
    lateinit var  txtadd : EditText
     val foods = mutableListOf( "Dosa","Briyani","Parotta")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtfood=findViewById(R.id.txtfood)
        btnnxt=findViewById(R.id.btnnxt)
        txtadd=findViewById(R.id.txtadd)


        txtadd.setOnClickListener {
            val newfood =txtadd.text.toString()
            foods.add(newfood)
            txtadd.text.clear()
        }

        btnnxt.setOnClickListener {
            val random = Random
            val randomfood =random.nextInt(foods.count())
               txtfood .text =foods(randomfood)




        }






    }



}


