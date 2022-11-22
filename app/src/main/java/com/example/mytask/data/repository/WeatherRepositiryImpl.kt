package com.example.mytask.data.repository

import com.example.mytask.data.mappers.toWeatherInfo
import com.example.mytask.data.remote.WeatherApi
import com.example.mytask.domain.repository.WeatherRepository
import com.example.mytask.domain.weather.WeatherInfo
import com.plcoding.weatherapp.domain.util.Resource
import java.lang.Exception

class WeatherRepositiryImpl(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return  try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}