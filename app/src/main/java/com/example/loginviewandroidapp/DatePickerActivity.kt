package com.example.loginviewandroidapp

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import com.example.loginviewandroidapp.databinding.ActivityDatePickerBinding
import java.util.Calendar

class DatePickerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDatePickerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatePickerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Time Picker
        binding.editTextTime.setOnClickListener {

            val calender = Calendar.getInstance()
            val hours = calender.get(Calendar.HOUR_OF_DAY)
            val minute = calender.get(Calendar.MINUTE)
            val timePicker = TimePickerDialog(this@DatePickerActivity,
                TimePickerDialog.OnTimeSetListener{ view: TimePicker?, hourOfDay: Int, minute: Int ->

                    binding.editTextTime.setText("$hourOfDay : $minute")

                },hours, minute,true)

            timePicker.setTitle("Chose Time")
            timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Set", timePicker)
            timePicker.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", timePicker)

            timePicker.show()
        }

        //Date Picker
        binding.editTextDate.setOnClickListener {
            val calender = Calendar.getInstance()

            val year = calender.get(Calendar.YEAR)
            val month = calender.get(Calendar.MONTH)
            val day = calender.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(this@DatePickerActivity,
                DatePickerDialog.OnDateSetListener { datePicker,
                                                     year,
                                                     month,
                                                     dayOfMonth ->
                    binding.editTextDate.setText("$dayOfMonth/${month + 1}/$year")

                },year, month, day)

            datePicker.setTitle("Please set your calender information")
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Set Calender", datePicker)
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"CANCEL", datePicker)

            datePicker.show()
        }
    }
}