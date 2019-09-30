package com.dids.expensetrack.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.dids.expensetrack.database.entities.AccountType
import io.reactivex.Flowable

@Dao
interface AccountTypeDao : BaseDao<AccountType> {
    @Query("SELECT * FROM account_type_table")
    fun getAllACcountTypes(): Flowable<List<AccountType>>
}