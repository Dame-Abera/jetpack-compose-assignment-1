package com.example.jetpack_compose_assignment_1.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_assignment_1.model.Course
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CourseListScreen(courses: List<Course>) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Academic Courses") })
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            items(courses) { course ->
                CourseCard(course = course)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseListScreenPreview() {
    Jetpackcomposeassignment1Theme{
        val sampleCourses = listOf(
            Course(
                title = "Calculus I",
                code = "MATH101",
                creditHours = 4,
                description = "Introduction to differential and integral calculus.",
                prerequisites = "Pre-Calculus"
            ),
            Course(
                title = "English Literature",
                code = "ENG201",
                creditHours = 3,
                description = "Study of classic and modern literature.",
                prerequisites = "English Composition I"
            )
        )
        CourseListScreen(courses = sampleCourses)
    }
}

