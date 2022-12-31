package com.example.mytask.presentation.scrollForTeacher

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
import com.example.mytask.R
import com.example.mytask.databinding.FragmentScrollForAuditiriumBinding
import com.example.mytask.presentation.blankAddedUniversity.BlankAddedUniversityFragment
import com.example.mytask.presentation.main.MainFragment
import com.example.mytask.presentation.scrollForAuditoria.AuditoriumListAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

class ScrollForAuditoriumFragment : Fragment() {

    private lateinit var binding: FragmentScrollForAuditiriumBinding

    private lateinit var viewModel: ScrollForAuditoriumViewModel

    private lateinit var adapter: AuditoriumListAdapter

    @Inject
    lateinit var viewModelFactory: ScrollForAuditoriumFactory

    companion object {
        val TAG = ScrollForAuditoriumFragment::class.simpleName

        fun newInstance(): ScrollForAuditoriumFragment {
            return ScrollForAuditoriumFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        diSetup()
        viewModel = ViewModelProvider(this, viewModelFactory)[ScrollForAuditoriumViewModel::class.java]
        adapter = AuditoriumListAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentScrollForAuditiriumBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.auditoriumRecyclerView.adapter = adapter

        binding.buttonBack.setOnClickListener {
            popBack()
        }
        binding.buttonPlus.setOnClickListener {
            openBlankAddedAuditorium()
        }

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.viewState.onEach(::handleUiState).launchIn(this)
            }
        }
    }
    private fun diSetup(){
        (requireActivity().application as App).appComponent.inject(this)
    }

    private fun handleUiState(viewState: ViewStateAudit) {
        if (viewState.loading) {
            // TODO: create progressBar
        }
        if (viewState.error) {
            // TODO: create error, hide progress, hide list with data
        }

        if (viewState.loading.not() && viewState.error.not()) {
            binding.auditoriumRecyclerView.visibility = View.VISIBLE
            adapter.submitList(viewState.classroomName)
        }
    }

    private fun popBack() {
        parentFragmentManager.popBackStack()
    }

    private fun openBlankAddedAuditorium() {
        parentFragmentManager.beginTransaction()
            .replace(
                R.id.container,
                BlankAddedUniversityFragment.newInstance(),
                BlankAddedUniversityFragment.TAG
            )
            .addToBackStack(MainFragment.TAG)
            .commit()
    }
}