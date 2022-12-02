package jp.ac.it_college.std.s21023.androidkadai

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import jp.ac.it_college.std.s21023.AndroidKadai.databinding.FragmentByGenerationBinding

class ByGenerationFragment : Fragment() {
    private var _binding: FragmentByGenerationBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentByGenerationBinding.inflate(inflater, container, false)
        binding.gen1.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ByGenerationDirections.actionByGeneration2ToQuiz2().apply {
                    num = 1
                }
            )
        }
        binding.gen2.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ByGenerationDirections.actionByGeneration2ToQuiz2().apply {
                    num = 2
                }
            )
        }
        binding.gen3.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ByGenerationDirections.actionByGeneration2ToQuiz2().apply {
                    num = 3
                }
            )
        }
        binding.gen4.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ByGenerationDirections.actionByGeneration2ToQuiz2().apply {
                    num = 4
                }
            )
        }
        binding.gen5.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ByGenerationDirections.actionByGeneration2ToQuiz2().apply {
                    num = 5
                }
            )
        }
        binding.gen6.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ByGenerationDirections.actionByGeneration2ToQuiz2().apply {
                    num = 6
                }
            )
        }
        binding.gen7.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ByGenerationDirections.actionByGeneration2ToQuiz2().apply {
                    num = 7
                }
            )
        }
        binding.gen8.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ByGenerationDirections.actionByGeneration2ToQuiz2().apply {
                    num = 8
                }
            )
        }
        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}