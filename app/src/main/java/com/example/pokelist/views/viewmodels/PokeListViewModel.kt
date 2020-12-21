package com.example.pokelist.views.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.pokelist.views.network.RetrofitProvider
import com.example.pokelist.views.network.models.PokeResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokeListViewModel : ViewModel() {
    val retrofitProvider = RetrofitProvider()

    fun getPokeList(){
        retrofitProvider.getPokeService().getPokeList().enqueue(object:
            Callback<PokeResponse>{
                override fun onResponse(
                    call :Call<PokeResponse>,
                    response: Response<PokeResponse>
                ) {
                    if(response.isSuccessful){
                        response.body()?.let { response ->
                            Log.d("Lista Pokemones", response.toString())
                        }
                    }
                }

                override fun onFailure(call: Call<PokeResponse>, t: Throwable){
                    TODO( "error")

                }


        })

    }
}