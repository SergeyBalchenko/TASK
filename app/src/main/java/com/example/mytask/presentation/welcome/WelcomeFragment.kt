package com.example.mytask.presentation.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytask.R
import com.example.mytask.databinding.FragmentWelcomeBinding
import com.example.mytask.presentation.main.MainFragment

class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding

    companion object {
        val TAG = WelcomeFragment::class.simpleName

        fun newInstance(): WelcomeFragment {
            return WelcomeFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonDoIt.setOnClickListener {
            openMainFragment()
        }
    }


    private fun openMainFragment() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment.newInstance(), MainFragment.TAG)
            .addToBackStack(TAG)
            .commit()
    }
}