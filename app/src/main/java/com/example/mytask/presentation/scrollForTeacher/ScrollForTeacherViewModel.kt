package com.example.mytask.presentation.scrollForTeacher

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mytask.data.entities.Teacher
import com.example.mytask.domain.usecase.GetTeacherUseCase
import com.example.mytask.presentation.scrollForTeacher.ViewState.Companion.INIT_VALUE
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class ScrollForTeacherViewModel(
    private val getTeachersUseCase: GetTeacherUseCase
) : ViewModel() {

    private val _viewState = MutableStateFlow(INIT_VALUE)
    val viewState = _viewState.asStateFlow()

    init {
        viewModelScope.launch {
            _viewState.emit(
                _viewState.value.copy(
                    loading = true,
                    error = false
                )
            )
            val teachers = getTeachersUseCase.invoke()
            _viewState.emit(
                _viewState.value.copy(
                    teachers = teachers,
                    loading = false,
                    error = false
                )
            )
        }
    }
}

data class ViewState(
    val teachers: List<Teacher> = listOf(),
    val loading: Boolean = false,
    val error: Boolean = false
) {
    companion object {
        val INIT_VALUE = ViewState()
    }
}

class ScrollForTeacherViewModelFactory @Inject constructor(
    private val getTeachersUseCase: GetTeacherUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ScrollForTeacherViewModel(getTeachersUseCase) as T
    }
}