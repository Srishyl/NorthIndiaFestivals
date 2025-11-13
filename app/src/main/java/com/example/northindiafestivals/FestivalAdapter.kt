package com.example.northindiafestivals

import android.content.Intent
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
        val festival = festivals[position]
        holder.festivalName.text = festival

        // ⭐ CLICK EVENT HERE
        holder.card.setOnClickListener {
            val context = holder.itemView.context

            val intent = Intent(context, FestivalDetailActivity::class.java)
            intent.putExtra("STATE_NAME", stateName)
            intent.putExtra("FESTIVAL_NAME", festival)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = festivals.size
}
