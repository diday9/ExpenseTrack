package com.dids.expensetrack.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface BaseDao<T> {
    @Insert
    fun insert(item: T): Single<Long>

    @Delete
    fun delete(item: T): Completable
}