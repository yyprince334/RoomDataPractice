package com.prince.roomdatapractice

import android.app.Application

class WordsApplication: Application() {

    val database by lazy {
        WordRoomDataBase.getDatabase(this)
    }

    val repository by lazy {
        WordRepository(database.wordDao())
    }

}