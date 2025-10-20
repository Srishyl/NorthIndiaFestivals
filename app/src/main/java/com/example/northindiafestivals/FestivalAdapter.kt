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

    class FestivalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val card: CardView = itemView.findViewById(R.id.cardFestival)
        val festivalName: TextView = itemView.findViewById(R.id.textFestivalName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FestivalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_festival_card, parent, false)
        return FestivalViewHolder(view)
    }

    override fun onBindViewHolder(holder: FestivalViewHolder, position: Int) {
        val festival = festivals[position]
        holder.festivalName.text = festival

        // Random color background for fun appearance
        val colors = listOf(
            0xFFFFF59D.toInt(), // light yellow
            0xFFB3E5FC.toInt(), // sky blue
            0xFFFFCCBC.toInt(), // peach
            0xFFC8E6C9.toInt(), // light green
            0xFFD1C4E9.toInt()  // lavender
        )
        holder.card.setCardBackgroundColor(colors[position % colors.size])
    }

    override fun getItemCount(): Int = festivals.size
}
