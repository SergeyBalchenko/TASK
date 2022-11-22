package com.example.mytask.domain.repository

import com.example.mytask.domain.weather.WeatherInfo
import com.plcoding.weatherapp.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}