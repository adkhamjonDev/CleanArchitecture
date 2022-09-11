package uz.adkhamjondev.data.mapper

import uz.adkhamjondev.data.remote.dto.UserDetailDto
import uz.adkhamjondev.domain.model.UserDetailModel

fun UserDetailDto.toUser(): UserDetailModel {
    return UserDetailModel(
        user_name = login,
        imageUrl = avatar_url,
        user_blog = blog,
        user_location = location
    )
}