package jp.ac.it_college.std.s21007.pokequizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import jp.ac.it_college.std.s21007.pokequizapp.databinding.FragmentAnswerBinding

class Answer : Fragment() {
    private var _binding: FragmentAnswerBinding? = null
    private val binding get() = _binding!!
    val args: AnswerArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAnswerBinding.inflate(inflater, container, false)

        binding.collectText.apply {
            text = "${args.collecto}/10 問正解！！"
        }

        binding.geneSele.setOnClickListener {
            Navigation.findNavController(it).navigate(
                R.id.generationSelectction
            )
        }

        return binding.root
    }
}