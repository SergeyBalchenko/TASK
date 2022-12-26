package com.example.mytask.presentation.blankAddSubject

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
import com.example.mytask.databinding.FragmentBlankAddedSubjectBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

class BlankAddedSubjectFragment : Fragment() {

    private lateinit var binding: FragmentBlankAddedSubjectBinding

    private lateinit var viewModel: BlankAddedSubjectViewModel

    @Inject
    lateinit var viewModelFactory: BlankAddedSubjectViewModelFactory
    companion object {

        val TAG = BlankAddedSubjectFragment::class.simpleName
        fun newInstance() = BlankAddedSubjectFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlankAddedSubjectBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity().application as App).appComponent.inject(this)
        viewModel = ViewModelProvider(this, viewModelFactory)[BlankAddedSubjectViewModel::class.java]
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
                Toast.makeText(requireActivity(), "Can't add a subject", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun setupClickListeners() {
        binding.addButton.setOnClickListener {
            val subject = binding.editTextTextSubjectName.text.toString()
            viewModel.addSubject(subject)
        }
    }
    private  fun popBack(){
        parentFragmentManager.popBackStack()
    }
}