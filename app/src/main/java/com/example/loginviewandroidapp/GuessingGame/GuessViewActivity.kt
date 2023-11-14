package com.example.loginviewandroidapp.GuessingGame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.databinding.ActivityGuessViewBinding
import kotlin.random.Random

class GuessViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuessViewBinding

    private var randomNumber = 0
    private var counter = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuessViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        randomNumber = Random.nextInt(101) // 0 btw 100

        Log.e("Randomized Number", randomNumber.toString())

        binding.guessBtn.setOnClickListener {
            counter -= 1

            val guess = binding.editTextInput.text.toString().toInt()

            if(guess == randomNumber){
                val newIntent = Intent(this@GuessViewActivity,ResultViewActivity::class.java)
                newIntent.putExtra("result",true)
                finish()
                startActivity(newIntent)

                return@setOnClickListener

            } else if (guess > randomNumber){
                binding.textViewIncrease.text = "DECREASE!"
                binding.textViewRemaingLife.text = "Remaining Life : $counter"

            } else if (guess < randomNumber){
                binding.textViewIncrease.text = "INCREASE!"
                binding.textViewRemaingLife.text = "Remaining Life : $counter"
            }

            if (counter == 0){
                val newIntent = Intent(this@GuessViewActivity,ResultViewActivity::class.java)
                newIntent.putExtra("result",false)

                finish()
                startActivity(newIntent)
            }

            binding.editTextInput.setText("")

        }

    }
}