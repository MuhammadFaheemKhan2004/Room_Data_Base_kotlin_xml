package com.example.room_database.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface user_dao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser(user: User)
    @Query("SELECT * FROM user_table")
    fun readAllData(): LiveData<List<User>>
    //@Query("SELECT * FROM user_table")
   // fun getAllUsers(): LiveData<List<User>>



}