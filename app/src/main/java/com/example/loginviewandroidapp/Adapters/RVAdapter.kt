package com.example.loginviewandroidapp.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.loginviewandroidapp.Models.Countries
import com.example.loginviewandroidapp.R

class RVAdapter(private val mContext: Context,private val countryList: List<Countries>)
    : RecyclerView.Adapter<RVAdapter.CardViewDesignObjectKeeper>(){

    inner class CardViewDesignObjectKeeper(view: View): RecyclerView.ViewHolder(view){
        var lineCardView: CardView
        var lineText: TextView
        var dotsImage: ImageView

        init {
            lineCardView = view.findViewById(R.id.lineCardView)
            lineText = view.findViewById(R.id.lineText)
            dotsImage = view.findViewById(R.id.dotsImage)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectKeeper {

        val desing = LayoutInflater.from(mContext).inflate(R.layout.card_design, parent, false)

        return CardViewDesignObjectKeeper(desing)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CardViewDesignObjectKeeper, position: Int) {
        val country = countryList.get(position)

        holder.lineText.text = country.nameCountry

        holder.lineCardView.setOnClickListener {
            Toast.makeText(mContext, "Country: ${country.id}", Toast.LENGTH_SHORT).show()
        }
    }

}