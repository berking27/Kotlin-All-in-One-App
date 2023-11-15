package com.example.loginviewandroidapp.Views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.loginviewandroidapp.Models.Users
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.Views.HomePageActivity.HomePageActivity
import com.example.loginviewandroidapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e("onCreate", "worked")

        binding.loginBtn.setOnClickListener {

            val usernameData = binding.usernameText.text.toString()


            val user = Users("1234", 23, "Berkin Koca")

            val newIntent = Intent(this@MainActivity, HomePageActivity::class.java)

            newIntent.putExtra("message","Welcome On Board")
            newIntent.putExtra("age",23)
            newIntent.putExtra("name", "Berkin Koca")
            newIntent.putExtra("object", user)
            newIntent.putExtra("username", usernameData)

            startActivity(newIntent)
        }

        binding.helpText.setOnClickListener {
            binding.helpText.text = "Are you sure?"
        }

    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart", "worked")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume", "worked")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause", "worked")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "worked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "worked")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart", "worked")
    }

}