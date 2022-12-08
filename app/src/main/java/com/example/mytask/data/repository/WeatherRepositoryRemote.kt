package com.example.mytask.data.repository

import com.example.mytask.data.api.WeatherApi
import com.example.mytask.data.model.Weather
import com.example.mytask.domain.repository.WeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WeatherRepositoryRemote(
    private val weatherApi: WeatherApi
) : WeatherRepository {

    override suspend fun getWeather(): Result<Weather> = withContext(Dispatchers.IO) {
        try {
            val result = weatherApi.getTemperature(44.0, 49.0)
            if (result.isSuccessful) {
                val mainModel = result.body()!!
                return@withContext Result.success(mainModel)
            } else {
                return@withContext Result.failure(Exception("Result not success"))
            }
        } catch (e: Exception) {
            return@withContext Result.failure(e)
        }
    }
}