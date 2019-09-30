package com.dids.expensetrack.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.dids.expensetrack.database.entities.Activity
import io.reactivex.Flowable

@Dao
interface ActivityDao : BaseDao<Activity> {
    @Query("SELECT * FROM activity_table")
    fun getAllActivities(): Flowable<List<Activity>>

    @Query("SELECT * FROM activity_table WHERE id = :id")
    fun getActivityById(id: Int): Flowable<Activity>

    @Query("SELECT * FROM activity_table WHERE category_id = :categoryId")
    fun getActivitiesByCategory(categoryId: Int): Flowable<List<Activity>>
}