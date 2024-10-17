package com.android.citybussp

import com.android.citybussp.viewmodel.BusesPositionViewModel
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun busesPositionViewModel(): BusesPositionViewModel
}
