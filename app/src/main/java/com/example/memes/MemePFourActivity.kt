package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemePFourActivity : AppCompatActivity() {
    lateinit var btnPreviousThree:Button
    lateinit var btnNextFour:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pfour)
        btnPreviousThree =findViewById(R.id.btnPreviousThree)
        btnPreviousThree .setOnClickListener {
            val intent = Intent(this, MemePThreeActivity::class.java)
            startActivity(intent)
        }
        btnNextFour = findViewById(R.id.btnNextFour)
        btnNextFour.setOnClickListener {
            val intent = Intent(this, MemePFiveActivity::class.java)
            startActivity(intent)
        }



    }
}