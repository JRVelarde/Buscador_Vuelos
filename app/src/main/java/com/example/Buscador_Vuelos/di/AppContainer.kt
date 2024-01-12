package com.example.Buscador_Vuelos.di

import android.content.Context
import com.example.Buscador_Vuelos.data.FlightDatabase
import com.example.Buscador_Vuelos.data.FlightRepository
import com.example.Buscador_Vuelos.data.OfflineFlightRepository

/**
 * App container for Dependency injection.
 */
interface AppContainer {
    val flightRepository: FlightRepository
}

/**
 * [AppContainer] implementation that provides instance of [OfflineFlightRepository]
 */
class AppDataContainer(private val context: Context) : AppContainer {
    /**
     * Implementation for [FlightRepository]
     */
    override val flightRepository: FlightRepository by lazy {
        OfflineFlightRepository(FlightDatabase.getDatabase(context).flightDao())
    }
}