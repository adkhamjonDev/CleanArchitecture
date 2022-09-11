package uz.adkhamjondev.data.repository.datasource

import kotlinx.coroutines.flow.Flow
import uz.adkhamjondev.domain.common.Resource
import uz.adkhamjondev.domain.model.UserDetailModel
import uz.adkhamjondev.domain.model.UserModel

interface UserRemoteDataSource {
    suspend fun getUsers(): Flow<Resource<List<UserModel>>>
    suspend fun getUserDetail(name: String): Flow<Resource<UserDetailModel>>
}