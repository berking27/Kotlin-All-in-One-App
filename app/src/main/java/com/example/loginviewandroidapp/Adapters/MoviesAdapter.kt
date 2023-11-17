package com.example.loginviewandroidapp.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.loginviewandroidapp.Models.Movies
import com.example.loginviewandroidapp.R

class MoviesAdapter(private val mContext: Context, private val moviesList: List<Movies>)
    :RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    //To reach UI elements ID's inside Card design
    inner class MoviesViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var movieImage: ImageView
        var movieTitle: TextView
        var moviePrice: TextView
        var buttonAddBucket: Button

        init {
            movieImage = view.findViewById(R.id.moviesImage)
            movieTitle = view.findViewById(R.id.textViewMoviesTitle)
            moviePrice = view.findViewById(R.id.textViewMoviesPrice)
            buttonAddBucket = view.findViewById(R.id.addBucketBtn)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val design = LayoutInflater.from(mContext).inflate(R.layout.card_movie_design, parent, false)

        return MoviesViewHolder(design)
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = moviesList[position]

        holder.movieTitle.text = movie.movie_name
        holder.moviePrice.text = "${movie.movie_price} TL"
        holder.movieImage.setImageResource(mContext.resources.getIdentifier(movie.movie_image,"drawable",mContext.packageName))

        holder.buttonAddBucket.setOnClickListener {
            Toast.makeText(mContext, "${movie.movie_name} added to bucket",Toast.LENGTH_SHORT).show()
        }
    }
}