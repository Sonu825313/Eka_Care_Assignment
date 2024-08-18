package com.example.ekacareassignment

import android.app.Application
import com.example.ekacareassignment.db.UserDatabase
import com.example.ekacareassignment.db.UserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob


class MyApp : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { UserDatabase.getDatabase(this) }
    val repository by lazy { UserRepository(database.userDao()) }
}