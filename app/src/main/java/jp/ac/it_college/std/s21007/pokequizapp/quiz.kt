package jp.ac.it_college.std.s21007.pokequizapp

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.UiThread
import androidx.annotation.WorkerThread
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import jp.ac.it_college.std.s21007.pokequizapp.Json.PokemonInfo
import jp.ac.it_college.std.s21007.pokequizapp.Json.PokemonService
import jp.ac.it_college.std.s21007.pokequizapp.databinding.FragmentQuizBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import com.squareup.picasso.Picasso
import kotlin.random.Random

private const val BASE_URL = "https://pokeapi.co/api/v2/"

class quiz : Fragment() {
    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!

    private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuizBinding.inflate(inflater, container, false)

        val id = (1..150)

        binding.btDisplay.setOnClickListener {
            showPokemonInfo(id.random())
        }

        binding.imgPokemon.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN)
        showPokemonInfo(id.random())


        return binding.root
    }

    @UiThread
    private fun showPokemonInfo(id: Int) {
        lifecycleScope.launch {
            val info = getPokemonInfo(id)
            val url = info.sprites.other.officialArtwork.frontDefault
            Picasso.get().load(url).into(binding.imgPokemon)
//          binding.name.text = getString(R.string.PokemonName, info.name)
            // ボタンにポケモンの名前表示
            binding.btDisplay.text = getString(R.string.PokemonName, info.name)

            //binding.type.text = getString(R.string.Type, info.type)
        }
    }

    @Suppress("BlockingMethodInNonBlockingContext")
    @WorkerThread
    private suspend fun getPokemonInfo(id: Int): PokemonInfo {
        return withContext(Dispatchers.IO) {
            val retrofit = Retrofit.Builder().apply {
                baseUrl(BASE_URL)
                addConverterFactory(MoshiConverterFactory.create(moshi))
            }.build()
            val service: PokemonService = retrofit.create(PokemonService::class.java)
            service.fetchPokemon(id).execute().body() ?: throw IllegalStateException("ポケモンが見つかりません")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
