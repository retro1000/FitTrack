package com.example.fittrack.config

import com.example.fittrack.ui.workout.api.WorkoutApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "https://localhost:8080"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val workoutApi: WorkoutApi by lazy {
        retrofit.create(WorkoutApi::class.java)
    }
}
