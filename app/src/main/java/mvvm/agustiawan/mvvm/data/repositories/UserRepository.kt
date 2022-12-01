package mvvm.agustiawan.mvvm.data.repositories

import mvvm.agustiawan.mvvm.data.network.MyApi
import mvvm.agustiawan.mvvm.data.network.SafeApiRequest
import mvvm.agustiawan.mvvm.data.network.responses.AuthResponse

class UserRepository : SafeApiRequest() {
    suspend fun userLogin(email: String, password: String): AuthResponse {
        return apiRequest { MyApi().userLogin(email, password) }
    }
}