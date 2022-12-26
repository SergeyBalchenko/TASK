package com.example.mytask.presentation.scrollForTeacher

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mytask.data.entities.Classroom
import com.example.mytask.domain.usecase.GetClassroomUsesCase
import com.example.mytask.presentation.scrollForTeacher.ViewStateAudit.Companion.INIT_VALUE_CLASS
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ScrollForAuditoriumViewModel(
    private val getClassroomUsesCase: GetClassroomUsesCase
) : ViewModel() {

    private val _viewState = MutableStateFlow(INIT_VALUE_CLASS)
    val viewState = _viewState.asStateFlow()

    init {
        viewModelScope.launch {
            _viewState.emit(
                _viewState.value.copy(
                    loading = true,
                    error = false
                )
            )
            val classroomName = getClassroomUsesCase.invoke()
            _viewState.emit(
                _viewState.value.copy(
                    classroomName = classroomName,
                    loading = false,
                    error = false
                )
            )
        }
    }
}

data class ViewStateAudit(
    val classroomName: List<Classroom> = listOf(),
    val loading: Boolean = false,
    val error: Boolean = false
) {
    companion object {
        val INIT_VALUE_CLASS = ViewStateAudit()
    }
}

// TODO: сделаешь viewModelFactory