package com.example.northindiafestivals

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FestivalDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_festival_detail)

        val festivalTitle = findViewById<TextView>(R.id.festivalTitle)
        val festivalDescription = findViewById<TextView>(R.id.festivalDescription)
        val festivalImage = findViewById<ImageView>(R.id.festivalImage)

        // Get values from Intent
        val state = intent.getStringExtra("STATE_NAME") ?: ""
        val festivalName = intent.getStringExtra("FESTIVAL_NAME") ?: ""

        // Set festival title
        festivalTitle.text = festivalName

        // Get full details of the state
        val detailsList = FestivalDetailsProvider.getFestivalDetails(state)

        // Find the festival in that state
        val selectedFestival = detailsList.find { it.name == festivalName }

        if (selectedFestival != null) {
            festivalDescription.text = selectedFestival.description
        } else {
            festivalDescription.text = "No details found for this festival."
        }

        // Set image dynamically based on festival
        val imageRes = FestivalSingleImageProvider.getImage(festivalName)
        festivalImage.setImageResource(imageRes)
    }
}
