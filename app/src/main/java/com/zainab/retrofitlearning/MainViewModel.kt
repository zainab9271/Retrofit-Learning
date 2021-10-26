package com.zainab.retrofitlearning

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zainab.retrofitlearning.model.JokeResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {

    val joke = MutableLiveData<JokeResponse>()
    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {
        API.apiService.getRandomJoke().enqueue(object : Callback<JokeResponse>{
            override fun onResponse(call: Call<JokeResponse>, response: Response<JokeResponse>) {
                joke.postValue(response.body())
            }

            override fun onFailure(call: Call<JokeResponse>, t: Throwable) {

            }

        })
    }
}