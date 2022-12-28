package com.example.mytask.presentation.scrollForSubject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.mytask.App
import com.example.mytask.databinding.FragmentScrollForSubjectBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

class ScrollForSubjectFragment : Fragment() {

    private lateinit var binding: FragmentScrollForSubjectBinding

    private lateinit var viewModel: ScrollForSubjectViewModel

    private lateinit var adapter: SubjectListAdapter

    @Inject
    lateinit var viewModelFactory: ScrollForTeacherFactory

    companion object {
        val TAG = ScrollForSubjectFragment::class.simpleName

        fun newInstance(): ScrollForSubjectFragment {
            return ScrollForSubjectFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        diSetup()
        viewModel = ViewModelProvider(this, viewModelFactory)[ScrollForSubjectViewModel::class.java]
        adapter = SubjectListAdapter()
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

        binding.recyclerViewSubject.adapter = adapter

        binding.buttonBack.setOnClickListener {
            popBack()
        }
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.viewState.onEach(::handleUiStateSub).launchIn(this)
            }
        }
    }
    private fun diSetup() {
        (requireActivity().application as App).appComponent.inject(this)
    }

    private fun handleUiStateSub(viewState: ViewStateSubject) {
        if (viewState.loading) {
            // TODO: create progressBar
        }
        if (viewState.error) {
            // TODO: create error, hide progress, hide list with data
        }

        if (viewState.loading.not() && viewState.error.not()) {
            binding.recyclerViewSubject.visibility = View.VISIBLE
            adapter.submitList(viewState.subjects)
        }
    }

    private fun popBack() {
        parentFragmentManager.popBackStack()
    }
}