package com.example.northindiafestivals

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FestivalDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_festival_detail)

        val festivalTitle = findViewById<TextView>(R.id.festivalTitle)
        val festivalDescription = findViewById<TextView>(R.id.festivalDescription)

        val state = intent.getStringExtra("STATE_NAME") ?: ""
        val festivalName = intent.getStringExtra("FESTIVAL_NAME") ?: ""

        festivalTitle.text = festivalName

        // Get full details list
        val detailsList = FestivalDetailsProvider.getFestivalDetails(state)

        // Find the matching festival detail
        val selectedFestival = detailsList.find { it.name == festivalName }

        if (selectedFestival != null) {
            festivalDescription.text = selectedFestival.description
        } else {
            festivalDescription.text = "No details found for this festival."
        }
    }
}
