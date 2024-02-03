package com.kalex.core.values

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun DogsCollectionTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        content = content,
    )
}