package dog.shebang.viewmodelcompose.ui.viewmodel

import android.content.ContentValues
import android.util.Log
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    val value: Int = 3

    override fun onCleared() {
        super.onCleared()

        Log.d(ContentValues.TAG, "onCleared Fragment ListViewModel")
    }
}