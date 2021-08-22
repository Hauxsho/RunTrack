package com.hauxsho.runtrack.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hauxsho.runtrack.R
import com.hauxsho.runtrack.ui.viewmodels.MainViewModel
import com.hauxsho.runtrack.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticFragment : Fragment(R.layout.fragment_statistics) {
    private val viewModel : StatisticsViewModel by viewModels()
}