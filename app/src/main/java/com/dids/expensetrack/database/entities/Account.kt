package com.dids.expensetrack.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "accounts_table",
    foreignKeys = [ForeignKey(
        entity = AccountType::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("type_id"),
        onDelete = ForeignKey.RESTRICT
    )]
)
data class Account(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "initial_balance") val initialBalance: Double = 0.0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String = "",
    @ColumnInfo(name = "type_id", index = true) val accountTypeId: Int,
    @ColumnInfo(name = "current_balance") val currentBalance: Double = 0.0
)