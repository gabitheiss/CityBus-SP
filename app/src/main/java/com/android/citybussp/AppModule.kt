package com.android.citybussp

import com.android.citybussp.repository.CityBusRepository
import com.android.citybussp.viewmodel.BusesPositionViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideCityBusRepository(): CityBusRepository = CityBusRepository()

    @Provides
    @Singleton
    fun provideBusesPositionViewModel(repository: CityBusRepository): BusesPositionViewModel =
        BusesPositionViewModel(repository)
}