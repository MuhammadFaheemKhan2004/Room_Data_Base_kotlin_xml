package com.example.room_database.data

import android.util.Log
import androidx.lifecycle.LiveData

class User_repositry(private val userDao: user_dao) {
    val readAllData :LiveData<List<User>> = userDao.readAllData()
    suspend fun adduser(user: User){

        userDao.addUser(user)





    }
}
