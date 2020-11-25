package dog.shebang.viewmodelcompose.ui

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val value: Int = 1

    override fun onCleared() {
        super.onCleared()

        Log.d(TAG, "onCleared")
    }
}