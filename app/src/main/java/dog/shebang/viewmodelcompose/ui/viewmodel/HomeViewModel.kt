package dog.shebang.viewmodelcompose.ui.viewmodel

import android.content.ContentValues
import android.util.Log
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    val value: Int = 2

    override fun onCleared() {
        super.onCleared()

        Log.d(ContentValues.TAG, "onCleared Fragment HomeViewModel")
    }
}