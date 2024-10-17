package com.android.citybussp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.citybussp.model.BusesPosition
import com.android.citybussp.repository.CityBusRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BusesPositionViewModel @Inject constructor(private val repository: CityBusRepository) : ViewModel() {

    val busesPositionLive = MutableLiveData<BusesPosition>()

    fun getBusesPositions() {
        repository.getBusesPosition()
    }

}