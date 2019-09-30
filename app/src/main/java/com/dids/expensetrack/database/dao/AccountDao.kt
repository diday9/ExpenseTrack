package com.dids.expensetrack.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.dids.expensetrack.database.entities.Account
import io.reactivex.Flowable

@Dao
interface AccountDao : BaseDao<Account> {
    @Query("SELECT * FROM accounts_table")
    fun getAllAccounts(): Flowable<List<Account>>

    @Query("SELECT * FROM accounts_table WHERE id = :id")
    fun getAccountById(id: Int): Flowable<Account>
}