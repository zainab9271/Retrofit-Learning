package com.zainab.retrofitlearning

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zainab.retrofitlearning.model.JokeResponse
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class MainViewModel: ViewModel() {

    val joke = MutableLiveData<JokeResponse>()
    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {

    }
}