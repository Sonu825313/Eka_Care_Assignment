package com.example.ekacareassignment.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ekacareassignment.User
import com.example.ekacareassignment.db.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(private val repository: UserRepository) : ViewModel() {

    fun insert(user: User) = viewModelScope.launch {
        repository.insert(user)
    }

    fun getAllUsers() = viewModelScope.launch {
        repository.getAllUsers()
    }
}