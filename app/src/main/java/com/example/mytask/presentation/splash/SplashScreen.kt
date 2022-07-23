package com.example.mytask.presentation.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mytask.R
import com.example.mytask.databinding.FragmentWelcomeBinding
import com.example.mytask.databinding.SplashScreenBinding
import com.example.mytask.presentation.welcome.WelcomeFragment

class SplashScreen  : AppCompatActivity() {

    private lateinit var binding: SplashScreenBinding

    companion object {
        fun newInstance(): SplashScreen {
            return SplashScreen()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
    }
}