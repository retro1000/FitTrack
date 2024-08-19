package com.example.fittrack.ui.workout.api

import com.example.fittrack.model.Workout
import retrofit2.Call
import retrofit2.http.GET

interface WorkoutApi {
    @GET("workouts")
    fun getWorkouts(): Call<Set<Workout>>
}