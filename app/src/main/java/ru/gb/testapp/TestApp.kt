package ru.gb.testapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TestApp : AppCompatActivity() {

    private lateinit var changeButton:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.text_view)
        changeButton = findViewById(R.id.change_button)

        changeButton.setOnClickListener {
            textView.text = "Hello"
        }
    }
}