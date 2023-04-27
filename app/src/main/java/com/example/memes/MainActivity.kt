package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnOne: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOne = findViewById(R.id.btnOne)
        btnOne.setOnClickListener {
            var intent = Intent(this, MemePTwoActivity::class.java)
            startActivity(intent)
        }
    }
}