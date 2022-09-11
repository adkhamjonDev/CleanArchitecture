package uz.adkhamjondev.data.repository

import kotlinx.coroutines.flow.Flow
import uz.adkhamjondev.data.repository.datasource.UserRemoteDataSource
import uz.adkhamjondev.data.repository.datasource.UserRemoteDataSourceImpl
import uz.adkhamjondev.domain.common.Resource
import uz.adkhamjondev.domain.model.UserDetailModel
import uz.adkhamjondev.domain.model.UserModel
import uz.adkhamjondev.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDataRemoteSource: UserRemoteDataSource
) : UserRepository {
    override suspend fun getUsers(): Flow<Resource<List<UserModel>>> {
        return userDataRemoteSource.getUsers()
    }

    override suspend fun getUser(name: String): Flow<Resource<UserDetailModel>> {
        return userDataRemoteSource.getUserDetail(name)
    }
}
