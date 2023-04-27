package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemePThreeActivity : AppCompatActivity() {
    lateinit var btnPreviousTwo:Button
    lateinit var btnNextThree: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_pthree)
        btnPreviousTwo = findViewById(R.id.btnPreviousTwo)
        btnPreviousTwo.setOnClickListener {
            val intent = Intent(this, MemePTwoActivity::class.java)
            startActivity(intent)
        }
        btnNextThree = findViewById(R.id.btnNextThree)
        btnNextThree.setOnClickListener {
            val intent = Intent(this, MemePFourActivity::class.java)
            startActivity(intent)
        }

    }
}