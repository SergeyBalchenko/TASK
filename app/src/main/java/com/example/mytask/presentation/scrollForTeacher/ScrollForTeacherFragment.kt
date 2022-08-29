package com.example.mytask.presentation.scrollForTeacher

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.databinding.FragmentScrollForTeacherBinding

class ScrollForTeacherFragment : Fragment() {

    private lateinit var binding: FragmentScrollForTeacherBinding

    companion object {
        val TAG = ScrollForTeacherFragment::class.simpleName

        fun newInstance(): ScrollForTeacherFragment {
            return ScrollForTeacherFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentScrollForTeacherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBack.setOnClickListener {
            popBack()
        }
    }

    private fun popBack() {
        parentFragmentManager.popBackStack()
    }
}