package com.example.loginviewandroidapp.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.loginviewandroidapp.Models.Countries
import com.example.loginviewandroidapp.R

class RVAdapter(private val mContext: Context,private val countryList: List<Countries>)
    : RecyclerView.Adapter<RVAdapter.CardViewHolder>(){

    inner class CardViewHolder(view: View): RecyclerView.ViewHolder(view){
        var lineCardView: CardView
        var lineText: TextView
        var dotsImage: ImageView

        init {
            lineCardView = view.findViewById(R.id.lineCardView)
            lineText = view.findViewById(R.id.lineText)
            dotsImage = view.findViewById(R.id.dotsImage)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {

        val desing = LayoutInflater.from(mContext).inflate(R.layout.card_design, parent, false)

        return CardViewHolder(desing)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val country = countryList[position]

        holder.lineText.text = country.nameCountry

        holder.lineCardView.setOnClickListener {
            Toast.makeText(mContext, "Country: ${country.id}", Toast.LENGTH_SHORT).show()
        }

        holder.dotsImage.setOnClickListener {

            val  popup = PopupMenu(mContext,holder.dotsImage)

            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)

            popup.show()

            popup.setOnMenuItemClickListener { item ->
                  when (item.itemId){
                      R.id.action_delete -> {
                          Toast.makeText(mContext, "Delete: ${country.id}", Toast.LENGTH_SHORT).show()
                          true
                      }

                      R.id.action_edit -> {
                          Toast.makeText(mContext, "Edit: ${country.id}", Toast.LENGTH_SHORT).show()
                          true
                      }

                      else -> {
                          false
                      }
                  }
            }

        }
    }

}