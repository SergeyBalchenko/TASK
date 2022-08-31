package com.example.mytask.presentation.blankForAddSubject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.databinding.FragmentBlankAddSubjectBinding

class BlankAddSubjectFragment : Fragment() {

    private val blankAddedSubjectViewModel = ViewModelProvider(this).get(BlankAddedSubjectViewModel::class.java)

    private lateinit var binding: FragmentBlankAddSubjectBinding

    companion object {
        val TAG = BlankAddSubjectFragment::class.simpleName

        fun newInstance(): BlankAddSubjectFragment {
            return BlankAddSubjectFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBlankAddSubjectBinding.inflate(inflater, container, false)
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