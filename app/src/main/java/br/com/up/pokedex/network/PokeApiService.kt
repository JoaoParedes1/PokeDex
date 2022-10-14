package br.com.up.pokedex.network

import br.com.up.pokedex.model.PokeListApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface PokeApiService {

    @GET("pokemon")
    fun getPokemons():Call<PokeListApiResponse>
}