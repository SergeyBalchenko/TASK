package com.example.mytask.domain.repository

import com.example.mytask.data.model.Weather

interface WeatherRepository {

    suspend fun getWeather(): Result<Weather>
}