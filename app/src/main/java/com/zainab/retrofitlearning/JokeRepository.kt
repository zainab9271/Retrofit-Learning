package com.zainab.retrofitlearning

import com.zainab.retrofitlearning.networking.API

class JokeRepository {
    suspend fun getRandomJoke() = API.apiService.getRandomJoke()
}