package com.example.loginviewandroidapp.Views.HomePageActivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.PopupMenu
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.databinding.ActivityAlertViewBinding
import com.google.android.material.snackbar.Snackbar

class AlertViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlertViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.popUpBtn.setOnClickListener {
            val popup = PopupMenu(this@AlertViewActivity,it)

            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)

            popup.setOnMenuItemClickListener { item->
                when(item.itemId){
                    R.id.action_delete -> {
                        Toast.makeText(applicationContext,"Deleted",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_edit ->{
                        Toast.makeText(applicationContext,"Edited",Toast.LENGTH_SHORT).show()
                        true
                    }

                    else -> false
                }

            }

            popup.show()
        }

        binding.defaultAlertViewBtn.setOnClickListener {

            val alertDialog = AlertDialog.Builder(this@AlertViewActivity)

            alertDialog.setMessage("This is how Alert View looks like")
            alertDialog.setTitle("Default Alert")
            alertDialog.setIcon(R.drawable.alert_image_24)

            alertDialog.setPositiveButton("OKEY"){ dialogInterface, i ->
                Toast.makeText(applicationContext, "Clicked",Toast.LENGTH_SHORT).show()
            }

            alertDialog.setNegativeButton("CANCEL"){ dialogInterface, i ->
                Toast.makeText(applicationContext,"Canceled!",Toast.LENGTH_SHORT).show()
            }

            alertDialog.create().show()

        }

        binding.customAlertViewBtn.setOnClickListener {

            val design = layoutInflater.inflate(R.layout.alert_custom_design, null)
            val editTextAlert = design.findViewById(R.id.editTextAlert) as EditText

            val ad = AlertDialog.Builder(this@AlertViewActivity)

            ad.setMessage("This is how Custom View looks like")
            ad.setTitle("Custom Alert")
            ad.setIcon(R.drawable.alert_image_24)
            ad.setView(design)

            ad.setPositiveButton("SAVE"){ dialogInterface, i ->

                val data = editTextAlert.text.toString()

                Toast.makeText(applicationContext,"Saved data is $data",Toast.LENGTH_SHORT).show()

            }

            ad.setNegativeButton("DELETE"){ dialogInterface, i ->

                Toast.makeText(applicationContext,"Deleted",Toast.LENGTH_SHORT).show()
            }
            ad.create().show()

        }

        binding.snackbarNormalBtn.setOnClickListener {

            Snackbar.make(it,"Hello",Snackbar.LENGTH_SHORT).show()

        }

        binding.snackBarReturnBtn.setOnClickListener {

            Snackbar.make(it,"Are you sure?",Snackbar.LENGTH_SHORT)
                .setAction("YES SIRR"){
                    Snackbar.make(it,"Mesagge Deleted",Snackbar.LENGTH_LONG).show()
                }
                .show()
        }

        binding.snackBarCustomBtn.setOnClickListener {

            val sb = Snackbar.make(it,"No Internet connection!",Snackbar.LENGTH_LONG)

            sb.setAction("Try Again"){

            }
            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.BLUE)
            sb.setBackgroundTint(Color.LTGRAY)
            sb.show()


        }

    }
}