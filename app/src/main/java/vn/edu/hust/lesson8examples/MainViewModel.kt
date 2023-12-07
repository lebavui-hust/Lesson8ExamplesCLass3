package vn.edu.hust.lesson8examples

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import androidx.lifecycle.switchMap

class MainViewModel: ViewModel() {
    val count = MutableLiveData(100)
    fun increaseCount() {
        count.postValue(count.value!! + 1)
    }

    val text1 = MutableLiveData("Hello")
    val reversedText: LiveData<String> = text1.map {
        it.reversed()
    }

    val textA = MutableLiveData("Text A")
    val textB = MutableLiveData("Text B")
    val aOrB = MutableLiveData(true)
    val switchText: LiveData<String> = aOrB.switchMap {
        if (it) textA else textB
    }
}