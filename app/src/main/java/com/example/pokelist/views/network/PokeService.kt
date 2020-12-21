package com.example.pokelist.views.network

import com.example.pokelist.views.network.models.PokeResponse
import com.example.pokelist.views.network.models.PokeResultsResponse
import retrofit2.Call
import retrofit2.http.GET

interface PokeService {
    @GET( "v2/pokemon?limit=50")
    fun getPokeList() : Call<PokeResponse>
}