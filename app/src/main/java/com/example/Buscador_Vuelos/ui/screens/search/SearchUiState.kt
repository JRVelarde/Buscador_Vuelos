package com.example.Buscador_Vuelos.ui.screens.search

import com.example.Buscador_Vuelos.model.Airport
import com.example.Buscador_Vuelos.model.Favorite

data class SearchUiState(
    val searchQuery: String = "",
    val selectedCode: String = "",
    val airportList: List<Airport> = emptyList(),
    val favoriteList: List<Favorite> = emptyList(),
)