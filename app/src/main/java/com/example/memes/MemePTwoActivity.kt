package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemePTwoActivity : AppCompatActivity() {
lateinit var btnPreviousOne:Button
lateinit var btnNextTwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_ptwo)
        btnPreviousOne = findViewById(R.id.btnPreviousOne)
        btnPreviousOne.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        btnNextTwo = findViewById(R.id.btnNextTwo)
        btnNextTwo.setOnClickListener {
            val intent = Intent(this, MemePThreeActivity::class.java )
            startActivity(intent)
        }
    }
}