package com.example.jetpack_compose_assignment_1.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_assignment_1.model.Course
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme

@Composable
fun CourseCard(course: Course) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { isExpanded = !isExpanded },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize()
        ) {
            Text(
                text = course.title,
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row {
                Text(
                    text = "Code: ${course.code}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Credits: ${course.creditHours}",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Description: ${course.description}",
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Prerequisites: ${course.prerequisites}",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseCardPreview() {
    Jetpackcomposeassignment1Theme{
        CourseCard(
            course = Course(
                title = "Calculus I",
                code = "MATH101",
                creditHours = 4,
                description = "Introduction to differential and integral calculus.",
                prerequisites = "Pre-Calculus"
            )
        )
    }
}
