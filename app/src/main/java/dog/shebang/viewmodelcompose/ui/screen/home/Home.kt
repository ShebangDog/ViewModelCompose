package dog.shebang.viewmodelcompose.ui.screen.home

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController) {
    Scaffold {
        Contents()
    }
}

@Composable
fun Contents() {
    Text(text = "Home")
}