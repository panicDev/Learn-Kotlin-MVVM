package id.paniclabs.mvvm.repository.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import id.paniclabs.mvvm.repository.data.User


@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}