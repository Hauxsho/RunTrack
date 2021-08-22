package com.hauxsho.runtrack.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hauxsho.runtrack.R
import com.hauxsho.runtrack.databinding.FragmentSetupBinding

class SetupFragment : Fragment(R.layout.fragment_setup) {
    private lateinit var binding : FragmentSetupBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentSetupBinding.inflate(layoutInflater)
        super.onViewCreated(view, savedInstanceState)

        binding.tvContinue.setOnClickListener{
            findNavController().navigate(R.id.action_setupFragment_to_runFragment)
        }
    }
}