package com.example.loginviewandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import com.example.loginviewandroidapp.databinding.ActivityProgressViewsBinding

class ProgressViewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProgressViewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProgressViewsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.progressBtn1.setOnClickListener {
            binding.progressBar.visibility = View.VISIBLE
        }

        binding.progressBtn2.setOnClickListener {
            binding.progressBar.visibility = View.INVISIBLE
        }

        binding.slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.textViewResult.text = "Result : $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        binding.showBtn.setOnClickListener {
            val incomingProgress = binding.slider.progress
            val incomingRating = binding.ratingBar.rating

            Log.e("progress",incomingProgress.toString())
            Log.e("rating",incomingRating.toString())
        }

    }
}