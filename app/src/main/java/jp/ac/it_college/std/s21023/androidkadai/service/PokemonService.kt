package jp.ac.it_college.std.s21023.androidkadai.service

import jp.ac.it_college.std.s21023.androidkadai.json.ImagePoke
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {
    @GET("https://pokeapi.co/api/v2/{id}")
    fun getPokemon(
        @Path("id")id: Int
    ): Call<ImagePoke>
}