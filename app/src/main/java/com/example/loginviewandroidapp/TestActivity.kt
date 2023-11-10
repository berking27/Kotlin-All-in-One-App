package com.example.loginviewandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.loginviewandroidapp.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.switch1.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                Log.e("Switch", "ON")
            }else{
                Log.e("Switch", "OFF")
            }
        }

        binding.toggleButton.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                Log.e("Toggle", "true")
            }else{
                Log.e("Toggle", "false")
            }
        }

        binding.signOutBtn.setOnClickListener {
            val newIntent = Intent(this@TestActivity,MainActivity::class.java)
            finish()

            startActivity(newIntent)
        }

        binding.toButtonsActivity.setOnClickListener {
            val newIntent = Intent(this@TestActivity,ButtonsViewActivity::class.java)

            startActivity(newIntent)
        }

        binding.toProgressBar.setOnClickListener {
            val newIntent = Intent(this@TestActivity,ProgressViewsActivity::class.java)

            startActivity(newIntent)
        }

        binding.contextBtn.setOnClickListener{
            Toast.makeText(applicationContext, "Hi This is how context seen", Toast.LENGTH_SHORT).show()
        }
    }

}