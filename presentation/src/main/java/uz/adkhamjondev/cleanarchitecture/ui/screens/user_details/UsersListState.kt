package uz.adkhamjondev.cleanarchitecture.ui.screens.user_details

import uz.adkhamjondev.domain.model.UserDetailModel


data class DetailScreenState(
    val isLoading: Boolean = false,
    val user: UserDetailModel?=null,
    val error: String = ""
)
