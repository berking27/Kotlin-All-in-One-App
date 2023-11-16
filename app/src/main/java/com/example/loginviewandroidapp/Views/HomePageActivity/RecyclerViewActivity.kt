package com.example.loginviewandroidapp.Views.HomePageActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginviewandroidapp.Adapters.RVAdapter
import com.example.loginviewandroidapp.Models.Countries
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRecyclerViewBinding
    private lateinit var countryList: ArrayList<Countries>
    private lateinit var adapter: RVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)

        val country1 = Countries(1,"USA")
        val country2 = Countries(2,"CANADA")
        val country3 = Countries(3,"JAPAN")
        val country4 = Countries(4,"Turkey")

        countryList = ArrayList<Countries>()
        countryList.add(country1)
        countryList.add(country2)
        countryList.add(country3)
        countryList.add(country4)

        adapter = RVAdapter(this,countryList)
        binding.rv.adapter = adapter

    }

}