package com.example.loginviewandroidapp.Views.HomePageActivity.GuessingGame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.databinding.ActivityResultViewBinding

class ResultViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getBooleanExtra("result", false)

        if (result){
            binding.textViewOutput.text = "You guess the number.\nAre you a magician?"
            binding.resultImage.setImageResource(R.drawable.baseline_sentiment_satisfied_alt_24)
        }else {
            binding.textViewOutput.text = "LOSEEER!!!"
            binding.resultImage.setImageResource(R.drawable.baseline_sentiment_very_dissatisfied_24)
        }

        binding.repeatBtn.setOnClickListener {
            val newIntent = Intent(this@ResultViewActivity, GuessViewActivity::class.java)
            finish()
            startActivity(newIntent)
        }
    }
}