package uz.adkhamjondev.cleanarchitecture.ui.screens

sealed class Screen(val route: String) {
    object UsersScreen : Screen("users_list")
    object UserDetailScreen : Screen("user_detail")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}