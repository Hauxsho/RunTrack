package com.hauxsho.runtrack.ui.viewmodels


import androidx.lifecycle.ViewModel
import com.hauxsho.runtrack.repo.MainRepositry
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepositry: MainRepositry
):ViewModel() {

}