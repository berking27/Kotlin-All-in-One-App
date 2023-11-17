package com.example.loginviewandroidapp.Views.HomePageActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.loginviewandroidapp.Adapters.MoviesAdapter
import com.example.loginviewandroidapp.Models.Movies
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.databinding.ActivityHomePageBinding
import com.example.loginviewandroidapp.databinding.ActivityMoviesMainBinding

class MoviesMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMoviesMainBinding

    private lateinit var moviesArrayList: ArrayList<Movies>
    private lateinit var adapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoviesMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.moviesRv.setHasFixedSize(true)
        binding.moviesRv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        getMovies()

        adapter = MoviesAdapter(this, moviesArrayList)

        binding.moviesRv.adapter = adapter

    }

    fun getMovies(){
        val f1 = Movies(1, "Django", "django", 12.99)
        val f2 = Movies(2, "Inception", "inception", 16.99)
        val f3 = Movies(3, "Interstellar", "interstellar", 9.99)
        val f4 = Movies(4, "The Hateful Eight", "thehatefuleight", 8.99)
        val f5 = Movies(5, "The Pianist", "thepianist", 12.99)
        val f6 = Movies(6, "Anadolu", "birzamanlaranadoluda", 6.99)

        moviesArrayList = ArrayList<Movies>()
        moviesArrayList.add(f1)
        moviesArrayList.add(f2)
        moviesArrayList.add(f3)
        moviesArrayList.add(f4)
        moviesArrayList.add(f5)
        moviesArrayList.add(f6)

    }
}