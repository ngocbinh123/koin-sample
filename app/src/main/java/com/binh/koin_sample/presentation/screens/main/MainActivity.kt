package com.binh.koin_sample.presentation.screens.main

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.binh.koin_sample.R
import com.binh.koin_sample.databinding.ActivityMainBinding
import com.binh.koin_sample.domain.repositories.GetCurrentTripRepository
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    val mainViewModel: MainViewModel by inject()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            viewModel = mainViewModel
            lifecycleOwner = this@MainActivity
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}