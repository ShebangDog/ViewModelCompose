package dog.shebang.viewmodelcompose.ui.screen.home

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.viewModel
import androidx.navigation.NavController
import dog.shebang.viewmodelcompose.ui.viewmodel.HomeViewModel

@Composable
fun Home(navController: NavController) {
    val viewModel: HomeViewModel = viewModel()

    Contents(viewModel)
}

@Composable
fun Contents(viewModel: HomeViewModel) {
    val value = viewModel.value

    Text(text = "Home $value")
}