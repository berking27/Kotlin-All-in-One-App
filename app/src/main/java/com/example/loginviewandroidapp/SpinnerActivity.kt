package com.example.loginviewandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.loginviewandroidapp.databinding.ActivitySpinnerBinding

class SpinnerActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySpinnerBinding
    private val countries = ArrayList<String>()
    private lateinit var dataAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpinnerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        createCountryArray()

        dataAdapter = ArrayAdapter(this@SpinnerActivity,android.R.layout.simple_list_item_1,android.R.id.text1,countries)

        binding.spinner.adapter = dataAdapter

        binding.spinnerBtn2.setOnClickListener {

        }

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                //binding.spinnerTextView.text = countries[position]
                Toast.makeText(applicationContext,"Choosen Country is ${countries[position]}",Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        binding.spinnerBtn2.setOnClickListener {
            binding.spinnerTextView.text = countries[binding.spinner.selectedItemPosition]
        }



    }

    private fun createCountryArray() {
        countries.add("Turkey")
        countries.add("United States of America")
        countries.add("England")
        countries.add("Canada")
        countries.add("Germany")
        countries.add("France")
    }
}

