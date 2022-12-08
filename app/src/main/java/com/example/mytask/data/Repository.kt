package com.example.mytask.data

import com.example.mytask.data.di.AppModule
import com.example.mytask.data.model.HourlyUnits
import com.example.mytask.data.model.Weather
import com.example.mytask.data.model.WeatherList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository {

    suspend fun getTempo(): Result<Weather> = withContext(Dispatchers.IO) {
        try {
            val result = AppModule.api.getTemperature(44.0,49.0)
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