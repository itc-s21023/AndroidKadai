package jp.ac.it_college.std.s21023.androidkadai

import jp.ac.it_college.std.s21023.androidkadai.json.PokemonInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {
    @GET("https://pokeapi.co/api/v2/{id}")
    fun getPokemon(
        @Path("id")id: Int
    ): Call<PokemonInfo>
}