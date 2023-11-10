package com.example.loginviewandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        val incomingMessage = intent.getStringExtra("message")
        val incomingAge = intent.getIntExtra("age", 0)
        val incomingName = intent.getStringExtra("name")
        val username = intent.getStringExtra("username")

        binding.hpTextView.text = username

        val user = intent.getSerializableExtra("object") as Users
        Log.e("USER TCNo",(user.tcNo))
        Log.e("USER NAME",(user.name))
        Log.e("USER AGE",(user.age).toString())




    }
}