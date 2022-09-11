package uz.adkhamjondev.cleanarchitecture.ui.screens.user_details

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.adkhamjondev.domain.common.Resource
import uz.adkhamjondev.domain.use_case.UserUseCase
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val userUseCase: UserUseCase
) : ViewModel() {

    private val _state = mutableStateOf(DetailScreenState())
    val state: State<DetailScreenState> = _state

    suspend fun getUser(name: String) {
        userUseCase(name).onEach {
            when (it) {
                is Resource.Loading -> {
                    _state.value = DetailScreenState(isLoading = true)
                }
                is Resource.Error -> {
                    _state.value =
                        DetailScreenState(error = it.message ?: "An expected error occurred")
                }
                is Resource.Success -> {
                    _state.value = DetailScreenState(user = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }
}