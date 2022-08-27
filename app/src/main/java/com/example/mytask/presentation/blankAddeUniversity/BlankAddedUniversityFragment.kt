package com.example.mytask.presentation.blankAddeUniversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentBlankAddedUniversityBinding
import com.example.mytask.presentation.main.MainFragment

class BlankAddedUniversityFragment : Fragment() {

    private lateinit var binding: FragmentBlankAddedUniversityBinding

    companion object {
        val TAG = BlankAddedUniversityFragment::class.simpleName

        fun newInstance(): BlankAddedUniversityFragment{
            return BlankAddedUniversityFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBlankAddedUniversityBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBack.setOnClickListener {
            openMainScreen()
        }
    }
    private fun openMainScreen(){
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment.newInstance(), MainFragment.TAG)
            .addToBackStack(MainFragment.TAG)
            .commit()
    }
}