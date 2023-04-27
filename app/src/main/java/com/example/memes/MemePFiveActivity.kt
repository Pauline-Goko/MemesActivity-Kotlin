package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemePFiveActivity : AppCompatActivity() {
    lateinit var btnPreviousFive: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pfive)
        btnPreviousFive = findViewById(R.id.btnPreviousFive)
        btnPreviousFive.setOnClickListener {
            val intent = Intent(this, MemePFourActivity::class.java)
            startActivity(intent)
        }

    }
}