package com.example.new_project_01

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnChangeText: Button
    private lateinit var btnChangeColor: Button
    private lateinit var textMain: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnChangeText = findViewById(R.id.btnChangeText)
        btnChangeColor = findViewById(R.id.btnChangeColor)
        textMain = findViewById(R.id.textMain)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnChangeText.setOnClickListener {
            textMain.text = "Hello"
        }

        btnChangeColor.setOnClickListener {
            textMain.setTextColor(Color.RED)
        }
    }
}
