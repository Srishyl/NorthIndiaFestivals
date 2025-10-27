package com.example.northindiafestivals

import android.app.ProgressDialog
import android.content.Intent
import android.location.Geocoder
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import java.util.Locale

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    private val northIndianStates = listOf(
        "Delhi", "Punjab", "Haryana", "Uttar Pradesh",
        "Rajasthan", "Bihar", "Uttarakhand",
        "Himachal Pradesh", "Jammu and Kashmir"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap.moveCamera(
            CameraUpdateFactory.newLatLngZoom(
                com.google.android.gms.maps.model.LatLng(28.6139, 77.2090), 5f
            )
        )

        mMap.setOnMapClickListener { latLng ->

            val loading = ProgressDialog(this)
            loading.setMessage("Loading festivals...")
            loading.setCancelable(false)
            loading.show()

            var stateName: String? = null

            try {
                val geocoder = Geocoder(this, Locale.getDefault())
                val addresses = geocoder.getFromLocation(latLng.latitude, latLng.longitude, 1)
                if (!addresses.isNullOrEmpty()) {
                    stateName = addresses[0].adminArea
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            if (stateName == null) {
                stateName = getApproximateState(latLng.latitude, latLng.longitude)
            }

            Handler(Looper.getMainLooper()).postDelayed({
                loading.dismiss()

                if (stateName != null && northIndianStates.contains(stateName)) {
                    val intent = Intent(this, FestivalActivity::class.java)
                    intent.putExtra("STATE_NAME", stateName)
                    startActivity(intent)
                } else {
                    android.widget.Toast.makeText(
                        this,
                        "State not detected / Not North India",
                        android.widget.Toast.LENGTH_SHORT
                    ).show()
                }

            }, 1200)
        }
    }

    private fun getApproximateState(lat: Double, lon: Double): String? {
        return when {
            lat in 28.0..30.0 && lon in 76.0..78.0 -> "Haryana"
            lat in 30.0..32.5 && lon in 74.0..77.0 -> "Punjab"
            lat in 28.3..28.9 && lon in 76.8..77.4 -> "Delhi"
            lat in 24.0..28.5 && lon in 77.0..84.0 -> "Uttar Pradesh"
            lat in 23.0..29.0 && lon in 69.0..77.0 -> "Rajasthan"
            lat in 24.0..27.5 && lon in 83.0..88.0 -> "Bihar"
            lat in 29.5..31.5 && lon in 78.0..81.0 -> "Uttarakhand"
            lat in 31.0..33.5 && lon in 76.0..79.0 -> "Himachal Pradesh"
            lat in 32.0..35.5 && lon in 74.0..78.0 -> "Jammu and Kashmir"
            else -> null
        }
    }
}
