package com.example.mytask.presentation.scrollForSubject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        binding = FragmentScrollForSubjectBinding.inflate(inflater, container, false)
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