package dog.shebang.viewmodelcompose.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.setContent
import androidx.navigation.compose.*
import dog.shebang.viewmodelcompose.ui.screen.Screen
import dog.shebang.viewmodelcompose.ui.screen.home.Home
import dog.shebang.viewmodelcompose.ui.theme.ViewModelComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MainApp() }
    }
}

@Composable
fun MainApp() {
    ViewModelComposeTheme {
        AppContents()
    }
}

@Composable
fun AppContents() {
    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomNavigation {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)

            listOf(Screen.Home, Screen.List).forEach { screen ->
                BottomNavigationItem(
                    icon = { Icon(asset = screen.icon) },
                    selected = currentRoute == screen.name,
                    onClick = {
                        navController.popBackStack()

                        if (screen.name != currentRoute) navController.navigate(screen.name)
                    }
                )
            }
        }
    }) { innerPadding ->

        NavHost(navController = navController, startDestination = Screen.Home.name) {
            composable(Screen.Home.name) { Home(navController) }
            composable(Screen.List.name) { dog.shebang.viewmodelcompose.ui.screen.list.List(navController) }
        }
    }

}
