package com.example.mytask.presentation.scrollForSubject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytask.R
import com.example.mytask.databinding.FragmentScrollForSubjectBinding

class ScrollForSubject : Fragment() {

    private  lateinit var binding: FragmentScrollForSubjectBinding

    companion object {
        val TAG = ScrollForSubject::class.simpleName

        fun newInstance(): ScrollForSubject {
            return ScrollForSubject()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scroll_for_subject, container, false)
    }
}