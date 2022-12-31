package com.example.mytask.presentation.scrollForTeacher

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.mytask.App
import com.example.mytask.R
import com.example.mytask.data.api.blankAddedTeacher.BlankAddedTeacherFragment
import com.example.mytask.databinding.FragmentScrollForTeacherBinding
import com.example.mytask.presentation.main.MainFragment
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

class ScrollForTeacherFragment : Fragment() {

    private lateinit var binding: FragmentScrollForTeacherBinding

    private lateinit var viewModel: ScrollForTeacherViewModel

    private lateinit var adapter: TeacherListAdapter

    @Inject
    lateinit var viewModelFactory: ScrollForTeacherViewModelFactory

    companion object {
        val TAG = ScrollForTeacherFragment::class.simpleName

        fun newInstance(): ScrollForTeacherFragment {
            return ScrollForTeacherFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        diSetup()
        viewModel = ViewModelProvider(this, viewModelFactory)[ScrollForTeacherViewModel::class.java]
        adapter = TeacherListAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentScrollForTeacherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.teacherRecyclerView.adapter = adapter

        binding.buttonBack.setOnClickListener {
            popBack()
        }
        binding.buttonPlus.setOnClickListener{
            openBlankAddedTeacher()
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.viewState.onEach(::handleUiState).launchIn(this)
            }
        }
    }

    private fun diSetup() {
        (requireActivity().application as App).appComponent.inject(this)
    }

    private fun handleUiState(viewState: ViewState) {
        if (viewState.loading) {
            // TODO: create progressBar
        }
        if (viewState.error) {
            // TODO: create error, hide progress, hide list with data
        }

        if (viewState.loading.not() && viewState.error.not()) {
            binding.teacherRecyclerView.visibility = View.VISIBLE
            adapter.submitList(viewState.teachers)
        }
    }

    private fun popBack() {
        parentFragmentManager.popBackStack()
    }
    private fun openBlankAddedTeacher() {
        parentFragmentManager.beginTransaction()
            .replace(
                R.id.container,
                BlankAddedTeacherFragment.newInstance(),
                BlankAddedTeacherFragment.TAG
            )
            .addToBackStack(MainFragment.TAG)
            .commit()
    }
}