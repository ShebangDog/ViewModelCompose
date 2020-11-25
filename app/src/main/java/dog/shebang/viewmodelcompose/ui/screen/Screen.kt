package dog.shebang.viewmodelcompose.ui.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.VectorAsset

sealed class Screen(val name: String, val icon: VectorAsset) {
    object Home : Screen("home", Icons.Default.Home)
    object List : Screen("list", Icons.Default.List)
}