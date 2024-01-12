package com.example.Buscador_Vuelos.ui.screens.flight_screen

import com.example.Buscador_Vuelos.model.Airport
import com.example.Buscador_Vuelos.model.Favorite

data class FlightsUiState(
    val code: String = "",
    val favoriteList: List<Favorite> = emptyList(),
    val destinationList: List<Airport> = emptyList(),
    val departureAirport: Airport = Airport(),
)
