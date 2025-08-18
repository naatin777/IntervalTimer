package io.github.naatin777.intervaltimer.addtimer

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.naatin777.intervaltimer.R
import io.github.naatin777.intervaltimer.databinding.FragmentAddTimerBinding

class AddTimerFragment : Fragment() {

    companion object {
        fun newInstance() = AddTimerFragment()
    }

    private val viewModel: AddTimerViewModel by viewModels()

    private var _binding: FragmentAddTimerBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddTimerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}