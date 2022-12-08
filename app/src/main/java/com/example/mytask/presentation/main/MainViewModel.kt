package com.example.mytask.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mytask.data.Repository
import com.example.mytask.data.model.HourlyUnits
import com.example.mytask.data.model.Weather
import com.example.mytask.data.model.WeatherList
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private var repo = Repository()
    private val _myMonewy: MutableLiveData<Weather> = MutableLiveData()
    val myMonewy: LiveData<Weather> get() = _myMonewy

    private val _errors = MutableLiveData<String>()
    val errors: LiveData<String> get() = _errors

    fun fetchWeatherData() {
        viewModelScope.launch {
            repo.getTempo().fold(
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