package com.example.mytask.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.mytask.data.model.Weather
import com.example.mytask.domain.usecase.GetTemperatureUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel(
    private val getTemperatureUseCase: GetTemperatureUseCase
) : ViewModel() {

    private val _myMonewy: MutableLiveData<Weather> = MutableLiveData()
    val myTemp: LiveData<Weather> get() = _myMonewy

    private val _errors = MutableLiveData<String>()
    val errors: LiveData<String> get() = _errors

    fun fetchWeatherData() {
        viewModelScope.launch {
            getTemperatureUseCase.invoke().fold(
                onSuccess = { mainModel ->
                    _myMonewy.postValue(mainModel)
                },
                onFailure = { error ->
                    _errors.postValue(error.message ?: "Something went wrong")
                }
            )
        }
    }
}

class MainViewModelFactory @Inject constructor(
    private val getTemperatureUseCase: GetTemperatureUseCase
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            getTemperatureUseCase
        ) as T
    }
}