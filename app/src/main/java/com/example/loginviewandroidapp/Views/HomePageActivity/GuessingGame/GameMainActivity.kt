package com.example.loginviewandroidapp.Views.HomePageActivity.GuessingGame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.databinding.ActivityGameMainBinding

class GameMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.gameStartBtn.setOnClickListener {

            val intent = Intent(this@GameMainActivity, GuessViewActivity::class.java)

            startActivity(intent)

        }

    }
}