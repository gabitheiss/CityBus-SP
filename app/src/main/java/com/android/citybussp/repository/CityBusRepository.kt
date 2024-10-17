package com.android.citybussp.repository

import com.android.citybussp.model.BusesPosition
import com.android.citybussp.service.CityBusService
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CityBusRepository {

    private val cityBusService = getRetrofit().create(CityBusService::class.java)

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.olhovivo.sptrans.com.br/v2.1")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getBusesPosition(): Response<BusesPosition> = cityBusService.getBusesPosition()
}