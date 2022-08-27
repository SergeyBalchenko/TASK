package com.example.mytask.presentation.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mytask.R
import com.example.mytask.databinding.SplashScreenBinding

class SplashScreenFragment  : AppCompatActivity() {

    private lateinit var binding: SplashScreenBinding

    companion object {
        fun newInstance(): SplashScreenFragment {
            return SplashScreenFragment()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
    }
}