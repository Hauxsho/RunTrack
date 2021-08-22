package com.hauxsho.runtrack.repo

import com.hauxsho.runtrack.db.Run
import com.hauxsho.runtrack.db.RunDAO
import javax.inject.Inject

class MainRepositry @Inject constructor(
    val runDAO: RunDAO
) {
    suspend fun insertRun(run : Run) = runDAO.insertRun(run)


    suspend fun deleteRun(run : Run) = runDAO.deleteRun(run)

    fun getALLRunsSortedByDate() = runDAO.getAllRunSortedByDate()

    fun getALLRunsSortedByDistance() = runDAO.getAllRunSortedByDistance()

    fun getALLRunsSortedByTimeinMillis() = runDAO.getAllRunSortedByTimeInMillis()

    fun getALLRunsSortedByAvgSpeed() = runDAO.getAllRunSortedByAvgSpeed()

    fun getALLRunsSortedByBurnedCalories() = runDAO.getAllRunSortedByCaloriesBurned()


    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()

    fun getTotalDistance() = runDAO.getTotalDistance()

    fun getTotalTimeinMillis() = runDAO.getTotalTimeInMillis()

    fun getTotalCalorieBurned() = runDAO.getTotalCaloriesBurned()
}