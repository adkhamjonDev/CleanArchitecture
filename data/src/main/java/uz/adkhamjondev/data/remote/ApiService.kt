package uz.adkhamjondev.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import uz.adkhamjondev.data.remote.dto.UserDetailDto
import uz.adkhamjondev.data.remote.dto.UsersDto

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<List<UsersDto>>

    @GET("users/{name}")
    suspend fun getUser(
        @Path("name") name: String
    ): Response<UserDetailDto>
}