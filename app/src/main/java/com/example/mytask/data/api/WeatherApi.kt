package com.example.mytask.data.api

import com.example.mytask.data.model.Hourly
import com.example.mytask.data.model.HourlyUnits
import com.example.mytask.data.model.Weather
import com.example.mytask.data.model.WeatherList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("v1/forecast?latitude=45.45&longitude=28.28&hourly=temperature_2m")
    suspend fun getTemperature(
        @Query("latatude") lat: Double,
        @Query("longitude") long: Double
    ): Response<Weather>
}