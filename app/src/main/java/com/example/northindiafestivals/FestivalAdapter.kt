package com.example.northindiafestivals

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class FestivalAdapter(
    private val festivals: List<String>,
    private val stateName: String
) : RecyclerView.Adapter<FestivalAdapter.FestivalViewHolder>() {

    class FestivalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val card: CardView = view.findViewById(R.id.cardFestival)
        val festivalName: TextView = view.findViewById(R.id.textFestivalName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FestivalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_festival_card, parent, false)
        return FestivalViewHolder(view)
    }

    override fun onBindViewHolder(holder: FestivalViewHolder, position: Int) {
        holder.festivalName.text = festivals[position]
    }

    override fun getItemCount(): Int = festivals.size
}
