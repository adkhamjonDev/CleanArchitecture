package uz.adkhamjondev.cleanarchitecture.ui.screens.user_list

import uz.adkhamjondev.domain.model.UserModel


data class UsersListState(
    val isLoading: Boolean = false,
    val users: List<UserModel> = emptyList(),
    val error: String = ""
)
