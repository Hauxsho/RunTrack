package com.hauxsho.runtrack.di

import android.content.Context
import androidx.room.Room
import com.hauxsho.runtrack.db.RunDatabase
import com.hauxsho.runtrack.other.Constant.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule
{

    @Singleton
    @Provides
    fun provideRunningDatabse(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(app , RunDatabase::class.java , RUNNING_DATABASE_NAME).build()


    @Singleton
    @Provides
    fun provideRunDao(db : RunDatabase) = db.getRunDao()
}