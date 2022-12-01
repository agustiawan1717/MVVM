package mvvm.agustiawan.mvvm.data.network.responses

import mvvm.agustiawan.mvvm.data.db.entities.User

data class AuthResponse (
    val isSuccsessful : Boolean?,
    val message : String?,
    val user : User?
)