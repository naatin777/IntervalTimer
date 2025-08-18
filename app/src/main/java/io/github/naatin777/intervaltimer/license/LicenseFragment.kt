package io.github.naatin777.intervaltimer.license

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.naatin777.intervaltimer.R
import io.github.naatin777.intervaltimer.databinding.FragmentLicenseBinding

class LicenseFragment : Fragment() {

    companion object {
        fun newInstance() = LicenseFragment()
    }

    private val viewModel: LicenseViewModel by viewModels()

    private var _binding: FragmentLicenseBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLicenseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}