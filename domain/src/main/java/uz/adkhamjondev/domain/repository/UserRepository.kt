package uz.adkhamjondev.domain.repository

import uz.adkhamjondev.domain.model.UserModel

interface UserRepository {
    suspend fun getUsers():List<UserModel>
}