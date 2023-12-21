package com.example.foodfolio.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material.icons.outlined.DocumentScanner
import androidx.compose.material.icons.outlined.Fastfood
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Restaurant
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme


@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    iconSize: Dp = 24.dp // Default icon size
) {
    Surface (color = MaterialTheme.colorScheme.background) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Home Button
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = { /* Handle Home button click */ },
                    modifier = Modifier
                        .background(color = Color.Transparent, shape = CircleShape)
                        .padding(4.dp)
                ) {
                    Icon(imageVector = Icons.Outlined.Home, contentDescription = null, tint = MaterialTheme.colorScheme.onSecondaryContainer,  modifier = Modifier.size(iconSize))
                }
                Text("Home", color = MaterialTheme.colorScheme.onSecondaryContainer, style = MaterialTheme.typography.labelLarge)
            }

            // Message Button
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = { /* Handle Message button click */ },
                    modifier = Modifier
                        .background(color = Color.Transparent, shape = CircleShape)
                        .padding(4.dp)
                ) {
                    Icon(imageVector = Icons.Outlined.AddCircleOutline, contentDescription = null, tint = MaterialTheme.colorScheme.onSecondaryContainer, modifier = Modifier.size(iconSize))
                }
                Text("Add", color = MaterialTheme.colorScheme.onSecondaryContainer, style = MaterialTheme.typography.labelLarge)
            }

            // Person Button
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = { /* Handle Person button click */ },
                    modifier = Modifier
                        .background(color = MaterialTheme.colorScheme.primary, shape = CircleShape)
                        .padding(4.dp)
                ) {
                    Icon(imageVector = Icons.Outlined.DocumentScanner, contentDescription = null, tint = MaterialTheme.colorScheme.surface, modifier = Modifier.size(iconSize))
                }
                Text("Scan", color = MaterialTheme.colorScheme.onSecondaryContainer, style = MaterialTheme.typography.labelLarge)
            }

            // Search Button
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = { /* Handle Search button click */ },
                    modifier = Modifier
                        .background(color = Color.Transparent, shape = CircleShape)
                        .padding(4.dp)
                ) {
                    Icon(imageVector = Icons.Outlined.Restaurant, contentDescription = null, tint = MaterialTheme.colorScheme.onSecondaryContainer, modifier = Modifier.size(iconSize))
                }
                Text("Recipe", color = MaterialTheme.colorScheme.onSecondaryContainer, style = MaterialTheme.typography.labelLarge)
            }

            // Settings Button
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(
                    onClick = { /* Handle Settings button click */ },
                    modifier = Modifier
                        .background(color = Color.Transparent, shape = CircleShape)
                        .padding(4.dp)
                ) {
                    Icon(imageVector = Icons.Outlined.Fastfood, contentDescription = null, tint = MaterialTheme.colorScheme.onSecondaryContainer,  modifier = Modifier.size(iconSize))
                }
                Text("Product", color = MaterialTheme.colorScheme.onSecondaryContainer, style = MaterialTheme.typography.labelLarge)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    AppTheme {
        BottomNavigationBar(iconSize = 32.dp)
    }
}