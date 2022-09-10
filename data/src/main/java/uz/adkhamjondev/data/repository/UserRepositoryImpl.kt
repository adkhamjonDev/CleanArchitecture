package uz.adkhamjondev.data.repository

import uz.adkhamjondev.data.remote.dto.UserDto
import uz.adkhamjondev.data.repository.datasource.UserDataStore
import uz.adkhamjondev.domain.model.UserModel
import uz.adkhamjondev.domain.repository.UserRepository

class UserRepositoryImpl(
    private val userDataStore: UserDataStore
) : UserRepository {

    override suspend fun getUsers(): List<UserModel> {
        return emptyList()
    }

}
