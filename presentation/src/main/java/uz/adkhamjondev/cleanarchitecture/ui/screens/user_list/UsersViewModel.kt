package uz.adkhamjondev.cleanarchitecture.ui.screens.user_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import uz.adkhamjondev.domain.common.Resource
import uz.adkhamjondev.domain.use_case.UsersUseCase
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    private val usersUseCase: UsersUseCase
) : ViewModel() {

    private val _state = mutableStateOf(UsersListState())
    val state: State<UsersListState> = _state

    suspend fun getUsers() {
        usersUseCase().onEach {
            when (it) {
                is Resource.Loading -> {
                    _state.value = UsersListState(isLoading = true)
                }
                is Resource.Error -> {
                    _state.value =
                        UsersListState(error = it.message ?: "An expected error occurred")
                }
                is Resource.Success -> {
                    _state.value = UsersListState(users = it.data ?: emptyList())
                }
            }
        }.launchIn(viewModelScope)
    }
}