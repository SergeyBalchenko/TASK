package com.example.mytask.presentation.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.databinding.SplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenFragment : Fragment() {

    private lateinit var binding: SplashScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SplashScreenBinding.inflate(inflater,container,false)

        val splashScreenViewModel = ViewModelProvider(this).get(SplashScreenViewModel::class.java)

        return binding.root
    }
}