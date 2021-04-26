package com.example.helloworldassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textDisplay = findViewById<TextView>(R.id.textView)
        val btnIncrement = findViewById<Button>(R.id.incrementButton)

        btnIncrement.setOnClickListener {
            counter++
            textDisplay.setText(counter.toString())
        }
    }
}