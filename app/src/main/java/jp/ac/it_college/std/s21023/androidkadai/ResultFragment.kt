package jp.ac.it_college.std.s21023.androidkadai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import jp.ac.it_college.std.s21023.AndroidKadai.R
import jp.ac.it_college.std.s21023.AndroidKadai.databinding.FragmentResultBinding


class ResultFragment : Fragment() {
    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!
    private val args: ResultFragment by navArgs()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        _binding = FragmentResultBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            Navigation.findNavController(it).navigate(
                ResultFragment.actionResult2ToByGeneration2()
            )
        }
        val score = args.score
        binding.textView4.text = getString(R.string.empty, result)

        return binding.root
    }
}