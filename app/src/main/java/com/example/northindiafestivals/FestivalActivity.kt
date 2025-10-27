package com.example.northindiafestivals

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FestivalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festival)

        val stateName = intent.getStringExtra("STATE_NAME") ?: "State"

        val header = findViewById<TextView>(R.id.headerText)
        header.text = "$stateName Festivals"

        val festivals = when (stateName) {
            "Delhi" -> listOf("Diwali", "Holi", "Eid", "Dussehra", "Parade")
            "Punjab" -> listOf("Baisakhi", "Lohri", "Gurpurab", "Hola Mohalla")
            "Haryana" -> listOf("Teej", "Baisakhi", "Gugga Naumi")
            "Uttar Pradesh" -> listOf("Deepotsav", "Kumbh Mela", "Janmashtami")
            "Rajasthan" -> listOf("Pushkar Fair", "Desert Festival", "Teej")
            "Bihar" -> listOf("Chhath Puja", "Sonepur Mela")
            "Uttarakhand" -> listOf("Harela", "Kumbh Mela")
            "Himachal Pradesh" -> listOf("Kullu Dussehra", "Losar")
            "Jammu and Kashmir" -> listOf("Tulip Festival", "Eid", "Lohri")
            else -> listOf("No major festivals found")
        }

        val rv = findViewById<RecyclerView>(R.id.recyclerViewFestivals)
        rv.layoutManager = GridLayoutManager(this, 2)
        rv.adapter = FestivalAdapter(festivals, stateName)
    }
}
