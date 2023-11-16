package com.example.loginviewandroidapp.Views.HomePageActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.databinding.ActivityFloatingLabelBinding
import org.w3c.dom.Text

class FloatingLabelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFloatingLabelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFloatingLabelBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonAccept.setOnClickListener {
            val name = binding.editTextName.text.toString().trim()
            val phone = binding.editTextPhoneNum.text.toString().trim()

            if (TextUtils.isEmpty(name) or TextUtils.isEmpty(phone)){
                val alertDialog = AlertDialog.Builder(this@FloatingLabelActivity)

                alertDialog.setMessage("AREAS SHOULD BE FILLED")
                alertDialog.setTitle("ATTENTION!")
                alertDialog.setIcon(R.drawable.alert_image_24)

                alertDialog.setNeutralButton("OKEY"){ dialogInterface, i ->
                    Toast.makeText(applicationContext, "Clicked",Toast.LENGTH_SHORT).show()
                }

                alertDialog.create().show()
            } else {
                Toast.makeText(applicationContext,"$name \n $phone",Toast.LENGTH_LONG).show()
            }

        }
    }

}