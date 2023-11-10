package com.example.loginviewandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginviewandroidapp.databinding.ActivityButtonsViewBinding

class ButtonsViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityButtonsViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonsViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }



}

