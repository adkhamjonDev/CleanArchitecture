package uz.adkhamjondev.domain.use_case

import kotlinx.coroutines.flow.Flow
import uz.adkhamjondev.domain.common.Resource
import uz.adkhamjondev.domain.model.UserModel
import uz.adkhamjondev.domain.repository.UserRepository
import javax.inject.Inject

class UsersUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(): Flow<Resource<List<UserModel>>> = userRepository.getUsers()
}