package com.example.mytask.presentation.blankAddeUniversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.databinding.FragmentBlankAddedUniversityBinding

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
        binding = FragmentBlankAddedUniversityBinding.inflate(inflater, container, false)
        val blankAddedUniversityViewModel = ViewModelProvider(this).get(BlankAddedUniversityViewModel::class.java)

        return binding.root
     }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBack.setOnClickListener {
            popBack()
        }
    }
    private fun popBack(){
        parentFragmentManager.popBackStack()
    }
}