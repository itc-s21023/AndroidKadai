package jp.ac.it_college.std.s21023.androidkadai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s21023.androidkadai.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //    private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
//    private var pokemonList: List<Poke>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //initPokemonList()


        //画面遷移をわかりやすくするため

    }
//    private fun initPokemonList() {
//        val jsonStr = resources.assets.open("ordered_pokemon.json").reader().readText()
//        val type = Types.newParameterizedType(List::class.java, Poke::class.java)
//        val adapter: JsonAdapter<List<Poke>> = moshi.adapter(type)
//
//        pokemonList = adapter.fromJson(jsonStr)
//
//    }
}