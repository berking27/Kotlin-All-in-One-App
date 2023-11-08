package com.example.loginviewandroidapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.loginviewandroidapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e("onCreate", "worked")

        binding.loginBtn.setOnClickListener {
            Snackbar.make(it,"Merhaba", Snackbar.LENGTH_SHORT).show()
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