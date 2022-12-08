package com.example.mytask.domain.usecase

import com.example.mytask.data.model.Weather
import com.example.mytask.domain.repository.WeatherRepository

class GetTemperatureUseCase(
    private val weatherRepository: WeatherRepository
) {

    suspend fun invoke(): Result<Weather> {
        return weatherRepository.getWeather()
    }
}