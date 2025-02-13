package com.example.room_database.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class viewModel(application: Application): AndroidViewModel(application ) {
    private val readAllData : LiveData<List<User>>
    private  val repositry :User_repositry

    init {
        val  userDao=UserDatabase.getDatabase(application).userDao()
        repositry=User_repositry(userDao)
        readAllData=repositry.readAllData

    }
   fun adduser(user:User){
        viewModelScope.launch(Dispatchers.IO){
            repositry.adduser(user)
        }
    }
}