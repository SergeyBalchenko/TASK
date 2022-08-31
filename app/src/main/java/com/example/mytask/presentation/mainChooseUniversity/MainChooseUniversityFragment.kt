package com.example.mytask.presentation.mainChooseUniversity.MainScrolChooseUniversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mytask.databinding.FragmentMainChooseUniersityBinding
import com.example.mytask.presentation.mainChooseUniversity.MainChooseUniversityViewModel

class MainChooseUniversityFragment : Fragment() {
    private val mainChooseUniersityViewModule = ViewModelProvider(this).get(MainChooseUniversityViewModel::class.java)

    private lateinit var binding: FragmentMainChooseUniersityBinding

    companion object {
        val TAG = MainChooseUniversityFragment::class.simpleName

        fun newInstance(): MainChooseUniversityFragment {
            return MainChooseUniversityFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainChooseUniersityBinding.inflate(inflater, container, false)
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