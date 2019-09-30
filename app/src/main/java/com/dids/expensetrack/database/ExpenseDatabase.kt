package com.dids.expensetrack.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dids.expensetrack.database.converter.Converter
import com.dids.expensetrack.database.dao.AccountDao
import com.dids.expensetrack.database.dao.AccountTypeDao
import com.dids.expensetrack.database.dao.ActivityDao
import com.dids.expensetrack.database.dao.CategoryDao
import com.dids.expensetrack.database.entities.Account
import com.dids.expensetrack.database.entities.AccountType
import com.dids.expensetrack.database.entities.Activity
import com.dids.expensetrack.database.entities.Category

@Database(
    entities = [Account::class, AccountType::class, Activity::class, Category::class],
    version = 1
)
@TypeConverters(Converter::class)
abstract class ExpenseDatabase : RoomDatabase() {
    abstract fun getAccountDao(): AccountDao
    abstract fun getAccountTypeDao(): AccountTypeDao
    abstract fun getActivityDao(): ActivityDao
    abstract fun getCategoryDao(): CategoryDao
}