package com.example.passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Orders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        val textView = findViewById<TextView>(R.id.textView)
        val orders = intent.getStringExtra(MainActivity.KEY)
        textView.text = orders
    }
}