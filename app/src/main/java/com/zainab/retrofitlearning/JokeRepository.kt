package com.zainab.retrofitlearning

import com.zainab.retrofitlearning.model.JokeResponse
import com.zainab.retrofitlearning.networking.API
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class JokeRepository {
    suspend fun getRandomJoke(): Flow<JokeResponse?>{
        return flow {
            emit(API.apiService.getRandomJoke().body())
        }
    }
}