package com.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpack_compose_assignment_1.model.Course
import com.example.jetpack_compose_assignment_1.ui.CourseListScreen
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpackcomposeassignment1Theme {
                val courses = listOf(
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
                    ),
                    Course(
                        title = "Introduction to Computer Science",
                        code = "CS101",
                        creditHours = 3,
                        description = "Basics of programming and computational thinking.",
                        prerequisites = "None"
                    )
                )
                CourseListScreen(courses = courses)
            }
        }
    }
}

