package com.example.weatherlatam

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.weatherlatam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        Log.d("TAG", "BKCOLOR: ${BuildConfig.BKCOLOR} ")

        if (BuildConfig.FLAVOR == "free") {
            Log.d("TAG", "URL FREE: ${BuildConfig.URL}")
        }
        else{
            Log.d("TAG", "URL PREMIUM: ${BuildConfig.URL}")
        }

        when (BuildConfig.BKCOLOR) {
            "black" -> binding.content.background.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.black
                )
            )

            "orange" -> binding.content.background.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.orange
                )
            )

            "white" -> binding.content.background.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.white
                )
            )
        }
    }
}