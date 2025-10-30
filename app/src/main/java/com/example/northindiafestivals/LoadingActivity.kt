package com.example.northindiafestivals

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        val stateName = intent.getStringExtra("stateName") ?: "State"
        val loadingText = findViewById<TextView>(R.id.loadingText)
        loadingText.text = "Loading festivals of $stateName..."

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, FestivalActivity::class.java)
            intent.putExtra("stateName", stateName)
            startActivity(intent)
            finish()
        }, 2000)
    }
}
