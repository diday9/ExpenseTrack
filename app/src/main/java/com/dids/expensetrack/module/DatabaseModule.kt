package com.dids.expensetrack.module

import android.content.Context
import androidx.room.Room
import com.dids.expensetrack.database.ExpenseDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(applicationContext: Context): ExpenseDatabase {
        return Room.databaseBuilder(
            applicationContext, ExpenseDatabase::class.java,
            "expense.db"
        ).build()
    }
}