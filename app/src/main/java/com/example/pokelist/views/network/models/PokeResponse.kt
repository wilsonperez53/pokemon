package com.example.pokelist.views.network.models

data class PokeResponse
    (val count: Int,
    val next: String,
    val previous: String,
    val results: List<PokeResultsResponse>)
    {}