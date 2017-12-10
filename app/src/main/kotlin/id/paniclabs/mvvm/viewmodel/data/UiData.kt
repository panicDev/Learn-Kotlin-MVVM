package id.paniclabs.mvvm.viewmodel.data

import id.paniclabs.mvvm.repository.data.User

data class UsersList(val users: List<User>, val message: String, val error: Throwable? = null)
