package com.example.fittrack.ui.workout

import com.example.fittrack.model.Workout

data class WorkoutUiState(

    val workoutCategories: Set<String> = setOf("Arm", "Leg", "Chest", "Back", "Abdominal"),
    val workouts: Set<Workout> = emptySet(),
)
