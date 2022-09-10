package uz.adkhamjondev.data.remote.dto

import uz.adkhamjondev.domain.model.UserModel

data class UserDto(
    val name: String
) : UserModel(myName = name)
