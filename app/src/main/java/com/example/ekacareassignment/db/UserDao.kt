package com.example.ekacareassignment.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.ekacareassignment.User

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * FROM user_table")
    suspend fun getAllUsers(): List<User>
}