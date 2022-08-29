package com.example.mytask.presentation.blankAddedTeacher

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.databinding.FragmentBlankAddedTeacherBinding

class BlankAddedTeacherFragment : Fragment() {

    private lateinit var binding: FragmentBlankAddedTeacherBinding

    companion object {
        val TAG = BlankAddedTeacherFragment::class.simpleName

        fun newInstance(): BlankAddedTeacherFragment {
            return BlankAddedTeacherFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBlankAddedTeacherBinding.inflate(inflater, container, false)
        return binding.root}
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