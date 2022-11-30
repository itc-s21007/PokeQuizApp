package jp.ac.it_college.std.s21007.pokequizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import jp.ac.it_college.std.s21007.pokequizapp.databinding.FragmentStartScreenBinding

class StartScreen : Fragment() {
    private var _binding: FragmentStartScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        _binding = FragmentStartScreenBinding.inflate(inflater, container,false)

        binding.start.setOnClickListener {
            Navigation.findNavController(it).navigate(
                R.id.generationSelectction
            )
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}