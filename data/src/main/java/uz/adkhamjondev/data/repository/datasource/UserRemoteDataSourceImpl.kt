package uz.adkhamjondev.data.repository.datasource

import kotlinx.coroutines.flow.Flow
import uz.adkhamjondev.data.mapper.toUser
import uz.adkhamjondev.data.remote.ApiService
import uz.adkhamjondev.domain.common.ErrorHandler
import uz.adkhamjondev.domain.common.Resource
import uz.adkhamjondev.domain.model.UserDetailModel
import uz.adkhamjondev.domain.model.UserModel
import javax.inject.Inject

class UserRemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : UserRemoteDataSource, ErrorHandler() {
    override suspend fun getUsers(): Flow<Resource<List<UserModel>>> = loadResult({
        apiService.getUsers()
    }, { data, flow ->
        val users = mutableListOf<UserModel>()
        data.map {
            users.add(UserModel(it.login, it.avatar_url))
        }
        return@loadResult flow.emit(Resource.Success(users))
    })

    override suspend fun getUserDetail(name: String): Flow<Resource<UserDetailModel>> = loadResult({
        apiService.getUser(name)
    }, { data, flow ->
        return@loadResult flow.emit(Resource.Success(data.toUser()))
    })
}