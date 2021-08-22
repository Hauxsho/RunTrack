package com.hauxsho.runtrack.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.hauxsho.runtrack.R
import com.hauxsho.runtrack.databinding.FragmentRunBinding
import com.hauxsho.runtrack.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel : MainViewModel by viewModels()

    private lateinit var binding : FragmentRunBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentRunBinding.inflate(layoutInflater)
        super.onViewCreated(view, savedInstanceState)

        binding.floatingActionButton.setOnClickListener{
            findNavController().navigate(R.id.action_runFragment_to_trackingFragment)
        }
    }
}