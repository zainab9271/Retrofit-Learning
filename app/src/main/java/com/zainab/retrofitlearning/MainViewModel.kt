package com.zainab.retrofitlearning

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zainab.retrofitlearning.model.JokeResponse
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val repository = JokeRepository()

    val joke = MutableLiveData<JokeResponse>()
    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {
        viewModelScope.launch {
            repository.getRandomJoke().collect{
                joke.postValue(it)
            }
        }
    }
}