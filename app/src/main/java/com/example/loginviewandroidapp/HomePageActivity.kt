package com.example.loginviewandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.loginviewandroidapp.GuessingGame.GameMainActivity
import com.example.loginviewandroidapp.databinding.ActivityHomePageBinding
import com.example.loginviewandroidapp.databinding.ActivityMainBinding

class HomePageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonTest.setOnClickListener {
            val newIntent = Intent(this@HomePageActivity,TestActivity::class.java)

            finish()

            startActivity(newIntent)
        }

        binding.imageViewBtn.setOnClickListener {
            val newIntent = Intent(this@HomePageActivity,ImageViewActivity::class.java)

            startActivity(newIntent)
        }

        binding.webViewBtn.setOnClickListener {
            val newIntent = Intent(this@HomePageActivity,WebViewActivity::class.java)

            startActivity(newIntent)
        }

        binding.datePickerBtn.setOnClickListener {
            val newIntent = Intent(this@HomePageActivity,DatePickerActivity::class.java)

            startActivity(newIntent)
        }

        binding.spinnerBtn.setOnClickListener {
            val newIntent = Intent(this@HomePageActivity,SpinnerActivity::class.java)

            startActivity(newIntent)
        }

        binding.guessGameBtn.setOnClickListener {
            val newIntent = Intent(this@HomePageActivity,GameMainActivity::class.java)

            startActivity(newIntent)
        }


        val incomingMessage = intent.getStringExtra("message")
        val incomingAge = intent.getIntExtra("age", 0)
        val incomingName = intent.getStringExtra("name")
        val username = intent.getStringExtra("username")

        if (username.isNullOrBlank()){
            binding.hpTextView.text = "Mr./Ms. No One"
        }else{
            binding.hpTextView.text = username
        }


        val user = intent.getSerializableExtra("object") as Users
        Log.e("USER TCNo",(user.tcNo))
        Log.e("USER NAME",(user.name))
        Log.e("USER AGE",(user.age).toString())




    }
}