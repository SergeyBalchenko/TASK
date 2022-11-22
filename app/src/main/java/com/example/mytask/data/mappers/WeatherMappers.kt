package com.example.mytask.data.mappers

import android.util.Log
import com.example.mytask.data.remote.WeatherDataDto
import com.example.mytask.data.remote.WeatherDto
import com.example.mytask.domain.weather.WeatherData
import com.example.mytask.domain.weather.WeatherInfo
import com.plcoding.weatherapp.domain.weather.WeatherType
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

private data class IndexedWeatherData(
    val index: Int,
    val data: WeatherData
)
val TAG = "My"

fun WeatherDataDto.toWeatherDataMap(): Map<Int, List<WeatherData>>{
    return time.mapIndexed{ index, time->
        val temperature = temperatures[index]
        val weatherCode = weatherCodes[index]
        val windSpeed = windSpeeds[index]
        val pressure = pressures[index]
        val humidity = humidities[index]
       IndexedWeatherData(
           index = index,
           data = WeatherData(
               time = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME),
               temperatureCelsius = temperature,
               pressure = pressure,
               windSpeed = windSpeed,
               humidity = humidity,
               weatherType = WeatherType.fromWMO(weatherCode)
           )
       )
    }.groupBy{
        it.index / 24
    }.mapValues {
        it.value.map { it.data }
    }.also { Log.d(TAG, "${it.values} is value and key is ${it.keys}") }
}

fun WeatherDto.toWeatherInfo(): WeatherInfo {
    val weatherDataMap = weatherData.toWeatherDataMap()
    val now = LocalDateTime.now()
    val currentWeatherData = weatherDataMap[0]?.find {
        val hour = if(now.minute < 30) now.hour else now.hour + 1
        it.time.hour == hour
        }
        return WeatherInfo(
            weatherDataPerDay = weatherDataMap,
            currentWeatherData = currentWeatherData
        )
}