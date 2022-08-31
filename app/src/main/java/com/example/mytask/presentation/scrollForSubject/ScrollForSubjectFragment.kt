package com.example.mytask.presentation.scrollForSubject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import com.example.mytask.databinding.FragmentScrollForSubjectBinding

class ScrollForSubjectFragment : Fragment() {

    private lateinit var binding: FragmentScrollForSubjectBinding

    companion object {
        val TAG = ScrollForSubjectFragment::class.simpleName

        fun newInstance(): ScrollForSubjectFragment {
            return ScrollForSubjectFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentScrollForSubjectBinding.inflate(inflater, container, false)

        val scrollForSubjectViewModel = ViewModelProvider(this).get(ScrollForSubjectViewModel::class.java)

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