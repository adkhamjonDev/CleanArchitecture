package uz.adkhamjondev.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.adkhamjondev.domain.common.Resource
import uz.adkhamjondev.domain.model.UserDetailModel
import uz.adkhamjondev.domain.model.UserModel

interface UserRepository {
    suspend fun getUsers(): Flow<Resource<List<UserModel>>>
    suspend fun getUser(name: String): Flow<Resource<UserDetailModel>>
}