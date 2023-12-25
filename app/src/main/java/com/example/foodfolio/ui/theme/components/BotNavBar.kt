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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    iconSize: Dp = 24.dp, // Default icon size,
    navCont : NavController

) {
    Surface (color = MaterialTheme.colorScheme.background) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Home Button
            BottomBarButton(
                buttonName = "Home",
                iconName = Icons.Outlined.Home,
                backgroundColor = Color.Transparent,
                iconColor = MaterialTheme.colorScheme.onSecondaryContainer,
                iconSize = iconSize,
                onClick = {
                    navCont.navigate("home") {
                        navCont.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )

            // Add Button
            BottomBarButton(
                buttonName = "Add",
                iconName = Icons.Outlined.AddCircleOutline,
                backgroundColor = Color.Transparent,
                iconColor = MaterialTheme.colorScheme.onSecondaryContainer,
                iconSize = iconSize,
                onClick = {
                    navCont.navigate("add") {
                        navCont.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )

            // Scan Button
            BottomBarButton(
                buttonName = "Scan",
                iconName = Icons.Outlined.DocumentScanner,
                backgroundColor = MaterialTheme.colorScheme.primary,
                iconColor = MaterialTheme.colorScheme.onPrimary,
                iconSize = iconSize,
                onClick = {}
            )

            // Recipe Button
            BottomBarButton(
                buttonName = "Recipe",
                iconName = Icons.Outlined.Restaurant,
                iconColor = MaterialTheme.colorScheme.onSecondaryContainer,
                backgroundColor = Color.Transparent,
                iconSize = iconSize,
                onClick = {}
            )

            // Product button
            BottomBarButton(
                buttonName = "Product",
                iconName = Icons.Outlined.Fastfood,
                iconColor = MaterialTheme.colorScheme.onSecondaryContainer,
                backgroundColor = Color.Transparent,
                iconSize = iconSize,
                onClick = {
                    navCont.navigate("product") {
                        navCont.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }

}

@Composable
fun BottomBarButton(buttonName: String,
                    iconName: ImageVector,
                    backgroundColor: Color,
                    iconColor: Color,
                    iconSize: Dp,
                    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .background(color = backgroundColor, shape = CircleShape)
                .padding(4.dp)
        ) {
            Icon(imageVector = iconName, contentDescription = null, tint = iconColor, modifier = Modifier.size(iconSize))
        }
        Text(buttonName, color = MaterialTheme.colorScheme.onSecondaryContainer, style = MaterialTheme.typography.labelLarge)
    }
}
