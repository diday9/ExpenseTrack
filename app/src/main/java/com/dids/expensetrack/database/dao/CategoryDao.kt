package com.dids.expensetrack.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.dids.expensetrack.database.entities.Category
import io.reactivex.Flowable

@Dao
interface CategoryDao : BaseDao<Category> {
    @Query("SELECT * FROM category_table")
    fun getAllCategories(): Flowable<List<Category>>
}