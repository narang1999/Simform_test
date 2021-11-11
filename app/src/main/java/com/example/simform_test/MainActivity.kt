package com.example.simform_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simform_test.databinding.ActivityMainBinding
import com.example.simform_test.extention.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}