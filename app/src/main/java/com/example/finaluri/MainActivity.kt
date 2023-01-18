package com.example.finaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    lateinit var NewGameButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NewGameButton = findViewById(R.id.NewGameButton)

        NewGameButton.setOnClickListener {
            val intent = Intent(MainActivity@this,Game::class.java)
            startActivity(intent)
        }
    }
}