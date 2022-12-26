package com.example.mytask.presentation.blankAddedUniversity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.mytask.App
import com.example.mytask.databinding.FragmentBlankAddedAuditoriumBinding
import com.example.mytask.databinding.FragmentScrollForAuditiriumBinding
import com.example.mytask.presentation.blankAddSubject.Effect
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

class BlankAddedUniversityFragment : Fragment() {

    private lateinit var binding: FragmentBlankAddedAuditoriumBinding
    private lateinit var viewModel: BlankAddedAuditoriumViewModel

    @Inject
    lateinit var viewModelFactory: BlankAddedUniversityViewModelFactory
    companion object {
        val TAG = BlankAddedUniversityFragment::class.simpleName

        fun newInstance() = BlankAddedUniversityFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankAddedAuditoriumBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity().application as App).appComponent.inject(this)
        viewModel = ViewModelProvider(this, viewModelFactory)[BlankAddedAuditoriumViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()

        binding.buttonBack.setOnClickListener{
            popBack()
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.effects.onEach(::handleUiEvent).launchIn(this)
            }
        }
    }

    private fun handleUiEvent(event: Effect) {
        when (event) {
            is Effect.SuccessAddedNavigation -> {
                parentFragmentManager.popBackStack()
            }

            is Effect.ErrorAdded -> {
                Toast.makeText(requireActivity(), "Can't add a Classroom", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun setupClickListeners() {
        binding.buttonAdd.setOnClickListener {
            val auditorium = binding.editTextTextAuditoriumName.text.toString()
            viewModel.addUniversity(auditorium)
        }
    }
    private fun popBack(){
        parentFragmentManager.popBackStack()
    }
}