package uz.adkhamjondev.cleanarchitecture.ui.screens.user_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import uz.adkhamjondev.cleanarchitecture.R
import uz.adkhamjondev.cleanarchitecture.ui.screens.Screen
import uz.adkhamjondev.domain.model.UserModel

@Composable
fun UsersScreen(
    navController: NavController,
    usersViewModel: UsersViewModel = hiltViewModel()
) {
    LaunchedEffect(true) {
        usersViewModel.getUsers()
    }
    val state = usersViewModel.state.value
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Box {
            LazyColumn(
                contentPadding = PaddingValues(16.dp)
            ) {
                items(state.users) { users ->
                    UsersItem(users) {
                        navController.navigate(Screen.UserDetailScreen.withArgs(it))
                    }
                }
            }
            if (state.error.isNotBlank()) {
                Text(
                    text = state.error,
                    color = MaterialTheme.colors.error,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .align(Alignment.Center)
                )
            }
            if (state.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        }
    }
}

@OptIn(ExperimentalCoilApi::class)
@Composable
fun UsersItem(
    userModel: UserModel,
    onItemClick: (String) -> Unit
) {
    Box {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)
                .clickable {
                    onItemClick(userModel.name!!)
                },
            elevation = 2.dp,
            shape = RoundedCornerShape(4.dp),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ) {
                Image(
                    painter = rememberImagePainter(
                        data = userModel.imageUrl,
                        builder = {
                            placeholder(R.drawable.ic_launcher_background)
                        }
                    ),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )
                Text(
                    text = userModel.name!!,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}