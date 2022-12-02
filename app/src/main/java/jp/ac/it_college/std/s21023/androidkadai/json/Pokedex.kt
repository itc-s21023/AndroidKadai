package jp.ac.it_college.std.s21023.androidkadai.json

import android.os.DropBoxManager

data class PokedexJson(
    val pokedex: List<Pokedex>
)


data class Pokedex(
    val id: Int,
    val name: String,
    val entries: List<DropBoxManager.Entry>
)


data class Entry(
    val entry_number: Int,
    val pokemon_id: Int
)