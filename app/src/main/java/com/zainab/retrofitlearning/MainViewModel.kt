package com.zainab.retrofitlearning

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zainab.retrofitlearning.model.JokeResponse
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    val joke = MutableLiveData<JokeResponse>()
    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {
        viewModelScope.launch {
            joke.postValue(API.apiService.getRandomJoke())
        }
    }
}