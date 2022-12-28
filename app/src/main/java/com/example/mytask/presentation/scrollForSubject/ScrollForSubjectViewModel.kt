package com.example.mytask.presentation.scrollForSubject

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mytask.data.entities.Subject
import com.example.mytask.data.entities.Teacher
import com.example.mytask.domain.usecase.GetSubjectsUseCase
import com.example.mytask.domain.usecase.GetTeacherUseCase
import com.example.mytask.presentation.scrollForSubject.ViewStateSubject.Companion.INIT_VALUE_SUB
import com.example.mytask.presentation.scrollForTeacher.ScrollForTeacherViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class ScrollForSubjectViewModel(
    private  val getSubjectsUseCase: GetSubjectsUseCase
) : ViewModel() {
    private val _viewState = MutableStateFlow(INIT_VALUE_SUB)
    val viewState = _viewState.asStateFlow()

    init {
        viewModelScope.launch {
            _viewState.emit(
                _viewState.value.copy(
                    loading = true,
                    error = false
                )
            )
            val subjects = getSubjectsUseCase.invoke()
            _viewState.emit(
                _viewState.value.copy(
                    subjects = subjects,
                    loading = false,
                    error = false
                )
            )
        }
    }
}

data class ViewStateSubject(
    val subjects: List<Subject> = listOf(),
    val loading: Boolean = false,
    val error: Boolean = false
) {
    companion object {
        val INIT_VALUE_SUB = ViewStateSubject()
    }
}
class ScrollForTeacherFactory @Inject constructor
    (private val getSubjectsUseCase: GetSubjectsUseCase
)
    : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ScrollForSubjectViewModel(getSubjectsUseCase) as T
    }
}