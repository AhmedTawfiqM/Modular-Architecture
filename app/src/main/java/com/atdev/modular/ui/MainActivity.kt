package com.atdev.modular.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.atdev.modular.BuildConfig
import com.atdev.modular.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val build = BuildConfig.API_BASE_URL
        Toast.makeText(this,build,Toast.LENGTH_SHORT).show()

    }
}