package jp.ac.it_college.std.s21023.androidkadai.json

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImagePoke(
    val sprites: Sprites
)

@JsonClass(generateAdapter = true)
data class Sprites(
    val other: Other
)

@JsonClass(generateAdapter = true)
data class Other(
    @Json(name = "official-artwork") val officialArtwork: OfficialArtwork
)

@JsonClass(generateAdapter = true)
data class OfficialArtwork(
    @Json(name = "front_default") val frontDefault: String
)