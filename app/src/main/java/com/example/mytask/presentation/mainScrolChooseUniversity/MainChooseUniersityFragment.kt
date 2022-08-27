package com.example.mytask.presentation.mainScrolChooseUniversity.MainScrolChooseUniversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentMainChooseUniersityBinding
import com.example.mytask.presentation.main.MainFragment

class MainChooseUniersityFragment : Fragment() {

    private lateinit var binding: FragmentMainChooseUniersityBinding

    companion object{
        val TAG = MainChooseUniersityFragment::class.simpleName

        fun newInstance(): MainChooseUniersityFragment {
            return MainChooseUniersityFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainChooseUniersityBinding.inflate(inflater , container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBack.setOnClickListener{
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