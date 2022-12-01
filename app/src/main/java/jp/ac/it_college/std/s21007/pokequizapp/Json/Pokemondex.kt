package jp.ac.it_college.std.s21007.pokequizapp.Json

data class PokemonEntry(
    val entry_number: Int,
    val pokemon_id: Int
)
data class PokemonGeneration(
    val id: Int,
    val name: String,
    val entries: List<PokemonEntry>
)
data class PokemondexJson(
    val pokedex: List<PokemonGeneration>
)