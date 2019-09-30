package com.dids.expensetrack.module

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dids.expensetrack.database.ExpenseDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule(private val applicationContext: Context) {
    @Singleton
    @Provides
    fun provideDatabase(): RoomDatabase {
        return Room.databaseBuilder(
            applicationContext, ExpenseDatabase::class.java,
            "expense.db"
        ).build()
    }
}