package com.example.pokelist.views.network

import retrofit2.Retrofit

class RetrofitProvider {
    private val baseUrl = "https://pokeapi.co/api/"
    val retrofit: Retrofit
    init {
        retrofit = Retrofit.Builder()
            .baseUrl( baseUrl)
            .build()
    }

    fun getPokeService() : PokeService {
        return retrofit.create(PokeService::class.java)
    }
}