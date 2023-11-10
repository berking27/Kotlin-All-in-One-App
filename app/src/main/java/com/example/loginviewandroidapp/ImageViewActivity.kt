package com.example.loginviewandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginviewandroidapp.databinding.ActivityImageViewBinding

class ImageViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImageViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.imageBtnTennis.setOnClickListener {
            //Static way to reach images
            //binding.imageView2.setImageResource(R.drawable.baseline_sports_tennis_24)
            //Dynamic way to reach images
            binding.imageView2.setImageResource(resources.getIdentifier("baseline_sports_tennis_24","drawable",packageName))
        }

        binding.imageBtnLogo.setOnClickListener {
            //Static way to reach images
            //binding.imageView2.setImageResource(R.drawable.image)
            //Dynamic way to reach images
            binding.imageView2.setImageResource(resources.getIdentifier("image","drawable",packageName))
        }
    }
}