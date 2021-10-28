package com.zainab.retrofitlearning.networking

import com.zainab.retrofitlearning.model.JokeResponse
import retrofit2.Response
import retrofit2.http.GET

interface JokeApiService{

    @GET("joke/Any")
    suspend fun getRandomJoke(): Response<JokeResponse>

}