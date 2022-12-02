package jp.ac.it_college.std.s21007.pokequizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import jp.ac.it_college.std.s21007.pokequizapp.databinding.FragmentGenerationSelectctionBinding


class GenerationSelection : Fragment() {
    private var _binding: FragmentGenerationSelectctionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGenerationSelectctionBinding.inflate(inflater, container,false)
        val element = pokemondexJson

        binding.generasion1.setOnClickListener {
            val list = element.pokedex[0].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion2.setOnClickListener {
            val list = element.pokedex[1].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion3.setOnClickListener {
            val list = element.pokedex[2].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion4.setOnClickListener {
            val list = element.pokedex[3].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion5.setOnClickListener {
            val list = element.pokedex[4].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion6.setOnClickListener {
            val list = element.pokedex[5].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion7.setOnClickListener {
            val list = element.pokedex[6].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion8.setOnClickListener {
            val list = element.pokedex[7].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion9.setOnClickListener {
            val list = element.pokedex[8].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion10.setOnClickListener {
            val list = element.pokedex[9].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion11.setOnClickListener {
            val list = element.pokedex[10].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion12.setOnClickListener {
            val list = element.pokedex[11].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion13.setOnClickListener {
            val list = element.pokedex[12].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }
        binding.generasion14.setOnClickListener {
            val list = element.pokedex[13].entries.map { e -> e.pokemon_id }.toIntArray()
            Navigation.findNavController(it).navigate(
                GenerationSelectionDirections.actionGenerationSelectctionToQuizscreen(list)
            )
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}