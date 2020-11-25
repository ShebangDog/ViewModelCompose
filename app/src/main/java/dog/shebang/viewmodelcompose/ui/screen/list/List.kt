package dog.shebang.viewmodelcompose.ui.screen.list

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.viewModel
import androidx.navigation.NavController
import dog.shebang.viewmodelcompose.ui.viewmodel.ListViewModel

@Composable
fun List(navController: NavController) {
    val viewModel: ListViewModel = viewModel()

    Contents(viewModel)
}

@Composable
fun Contents(viewModel: ListViewModel) {
    val value = viewModel.value

    Text(text = "List $value")
}