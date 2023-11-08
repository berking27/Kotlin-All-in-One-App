package com.example.loginviewandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginviewandroidapp.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.signOutBtn.setOnClickListener {

        }

        binding.contextBtn.setOnClickListener{
            Toast.makeText(applicationContext, "Hi This is how context seen", Toast.LENGTH_SHORT).show()
        }
    }

}