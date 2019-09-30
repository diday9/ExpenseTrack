package com.dids.expensetrack.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "activity_table",
    foreignKeys = [ForeignKey(
        entity = Category::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("category_id"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class Activity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "amount") val amount: Double,
    @ColumnInfo(name = "description") val description: String = "",
    @ColumnInfo(name = "date") val date: Date,
    @ColumnInfo(name = "payor_payee") val payorPayee: String = "",
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "category_id", index = true) val categoryId: Int
)