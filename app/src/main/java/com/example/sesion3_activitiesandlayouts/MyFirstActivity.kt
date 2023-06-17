package com.example.sesion3_activitiesandlayouts

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MyFirstActivity : Activity() {
    lateinit var TX: TextView
    lateinit var BT: Button
    var contador = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_first)
        TX = findViewById(R.id.TX)
        BT = findViewById(R.id.BT)

        BT.setOnClickListener{
            contador++
            TX.text = contador.toString()
            Toast.makeText(this,contador.toString(),Toast.LENGTH_LONG).show()
        }
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Hola",Toast.LENGTH_LONG).show()
    }
}
