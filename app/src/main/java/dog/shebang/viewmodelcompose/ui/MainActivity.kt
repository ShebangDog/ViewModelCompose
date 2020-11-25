package dog.shebang.viewmodelcompose.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.viewinterop.viewModel
import androidx.ui.tooling.preview.Preview
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
    Greeting("Android")
}

@Composable
fun Greeting(name: String) {
    val viewModel: MainViewModel = viewModel()

    Text(text = "Hello $name! ${viewModel.value}")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ViewModelComposeTheme {
        Greeting("Android")
    }
}