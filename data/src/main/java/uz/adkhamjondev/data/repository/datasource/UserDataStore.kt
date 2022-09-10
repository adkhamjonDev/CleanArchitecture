package uz.adkhamjondev.data.repository.datasource

import uz.adkhamjondev.data.remote.dto.UserDto

class UserDataStore : UserDataSource {
    override suspend fun getUsers(): List<UserDto> {
        return mutableListOf()
    }
}