package com.example.mytask.presentation.MainScrolChooseUniversity.MainScrolChooseUniversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentMainChooseUniersityBinding

class MainChooseUniersity : Fragment() {

    private lateinit var binding: FragmentMainChooseUniersityBinding

    companion object{
        val TAG = MainChooseUniersity::class.simpleName

        fun newInstance(): MainChooseUniersity {
            return MainChooseUniersity()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_choose_uniersity, container, false)
    }
}