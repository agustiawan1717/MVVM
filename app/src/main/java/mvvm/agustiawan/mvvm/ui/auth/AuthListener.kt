package mvvm.agustiawan.mvvm.ui.auth

import mvvm.agustiawan.mvvm.data.db.entities.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user : User)
    fun onFailure(message : String)
}