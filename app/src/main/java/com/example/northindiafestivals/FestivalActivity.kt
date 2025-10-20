package com.example.northindiafestivals

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FestivalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festival)

        val stateName = intent.getStringExtra("STATE_NAME") ?: "Unknown"

        val festivals = when (stateName) {
            "Delhi" -> listOf("Diwali", "Holi", "Eid", "Dussehra", "Independence Day Parade")
            "Punjab" -> listOf("Baisakhi", "Lohri", "Diwali", "Hola Mohalla", "Gurpurab")
            "Haryana" -> listOf("Teej", "Baisakhi", "Holi", "Diwali", "Gugga Naumi")
            "Uttar Pradesh" -> listOf("Ayodhya Deepotsav", "Barsana Holi", "Janmashtami", "Kumbh Mela", "Ram Navami")
            "Rajasthan" -> listOf("Pushkar Fair", "Gangaur", "Teej", "Desert Festival", "Diwali")
            "Bihar" -> listOf("Chhath Puja", "Sonepur Mela", "Diwali", "Holi", "Makar Sankranti")
            "Uttarakhand" -> listOf("Kumbh Mela", "Harela", "Nanda Devi Raj Jat", "Makar Sankranti", "Basant Panchami")
            "Himachal Pradesh" -> listOf("Kullu Dussehra", "Losar", "Phulaich", "Lohri", "Baisakhi")
            "Jammu and Kashmir" -> listOf("Tulip Festival", "Baisakhi", "Eid", "Navroz", "Lohri")
            else -> listOf("No major festivals found")
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewFestivals)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = FestivalAdapter(festivals, stateName)
    }
}
