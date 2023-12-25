package com.example.foodfolio.ui.theme.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FloatingAddButton(text: String, onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = onClick,
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.secondary,
        icon = { Icon(Icons.Filled.Add, text) },
        text = { Text(text = text) },
    )
}

@Preview
@Composable
fun FloatingAddButtonPrev() {
    FloatingAddButton(text = "Add") {
        
    }
}