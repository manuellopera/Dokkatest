package com.example.dynamicfeature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dokkatest.R

class MainActivity : AppCompatActivity() {
    /**
     * On create of dynamic feature
     *
     * @param savedInstanceState
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}