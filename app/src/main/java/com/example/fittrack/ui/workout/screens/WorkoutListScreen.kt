package com.example.fittrack.ui.workout.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.fittrack.ui.workout.WorkoutViewModel

@Composable
fun WorkoutListScreen(workoutViewModel: WorkoutViewModel){

    val workoutUiState by workoutViewModel.uiState.collectAsState()
    WorkoutLayout(workoutCategories = workoutUiState.workoutCategories)

}

@Composable
fun WorkoutLayout(
    workoutCategories: Set<String>
){

    var selectedTabIndex by rememberSaveable { mutableIntStateOf(0) }

    Column {
        TabRow(selectedTabIndex = selectedTabIndex) {
            workoutCategories.forEachIndexed{ index, category -> 
                Tab(
                    text = { Text(text = category) },
                    selected = selectedTabIndex==index,
                    onClick = {
                        selectedTabIndex = index
                    }
                )
            }
        }

        when(selectedTabIndex){
            0 ->
        }
    }
}