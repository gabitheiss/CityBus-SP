package com.android.citybussp

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.android.citybussp.databinding.ActivityMainBinding
import com.android.citybussp.ext.replaceFragmentWithAnimation
import com.android.citybussp.view.MapFragment

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragmentWithAnimation(MapFragment.newInstance(), R.id.containerView, true)
        window.statusBarColor = ContextCompat.getColor(this, R.color.blue_pattern)
    }
}