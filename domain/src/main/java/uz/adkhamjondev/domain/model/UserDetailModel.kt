package uz.adkhamjondev.domain.model

data class UserDetailModel(
    val user_name: String,
    val imageUrl: String,
    val user_blog: String,
    val user_location: String? = null
)
