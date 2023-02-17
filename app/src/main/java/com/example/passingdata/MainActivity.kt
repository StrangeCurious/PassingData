package com.example.passingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object {
        const val KEY = "com.example.passingdata.MainActivity.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)
        val et4 = findViewById<EditText>(R.id.et4)
        btnOrder.setOnClickListener {

            val orderList = et1.text.toString() +" " + et2.text.toString() + " " + et3.text.toString() + " " + et4.text.toString()

            val intent = Intent(this,Orders::class.java)
            intent.putExtra(KEY,orderList)
            startActivity(intent)
        }
    }
}