package dog.shebang.viewmodelcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.viewinterop.viewModel
import androidx.ui.tooling.preview.Preview
import dog.shebang.viewmodelcompose.ui.ViewModelComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewModelComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
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