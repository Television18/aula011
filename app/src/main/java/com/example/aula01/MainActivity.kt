package com.example.aula01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.C1)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val peso = editText.text.toString()
            val altura = editText.text.toString()
        }
    }
}
