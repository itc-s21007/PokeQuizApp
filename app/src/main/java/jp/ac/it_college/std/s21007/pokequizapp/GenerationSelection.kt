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

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}