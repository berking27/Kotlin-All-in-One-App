package com.example.loginviewandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginviewandroidapp.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.webView.settings.javaScriptEnabled = true

        binding.webView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr")
    }
}