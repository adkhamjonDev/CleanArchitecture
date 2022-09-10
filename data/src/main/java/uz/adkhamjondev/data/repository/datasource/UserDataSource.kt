package uz.adkhamjondev.data.repository.datasource

import uz.adkhamjondev.data.remote.dto.UserDto

interface UserDataSource {
    suspend fun getUsers(): List<UserDto>
}