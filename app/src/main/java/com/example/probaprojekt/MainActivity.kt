package com.example.probaprojekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.probaprojekt.adapter.PagerAdapter
import com.example.probaprojekt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()

    }

    private fun initialize() {

        binding.viewPager2.adapter = PagerAdapter(this)
        binding.tableLayout.tabIconTint = null
    }
}