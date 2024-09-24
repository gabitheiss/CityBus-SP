package com.android.citybussp.service

import com.android.citybussp.model.BusesPosition
import retrofit2.Response
import retrofit2.http.GET

interface CityBusService {

    @GET("/Posicao")
    fun getBusesPosition(): Response<BusesPosition>

}