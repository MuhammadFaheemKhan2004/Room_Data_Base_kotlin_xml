package com.example.room_database.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val firstname:String,
    val lastname:String,
    val age :Int
)
