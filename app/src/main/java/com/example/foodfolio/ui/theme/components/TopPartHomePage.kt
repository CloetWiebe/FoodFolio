package com.example.foodfolio.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme

@Composable
fun HamburgerMenuIcon(onClick: () -> Unit) {
    IconButton(
        onClick = onClick,
    ) {
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Hamburger Menu",
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier.size(40.dp)

        )
    }
}
@Composable
fun ArrowsWithDateExample(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ArrowIcon(icon = Icons.Default.ArrowBack, modifier = Modifier.padding(end = 8.dp))
        Text(text = "7 Oct", modifier = Modifier.padding(horizontal = 8.dp), color = MaterialTheme.colorScheme.primary, style = MaterialTheme.typography.headlineSmall)
        ArrowIcon(icon = Icons.Default.ArrowForward, modifier = Modifier.padding(start = 8.dp))
    }
}

@Composable
fun ArrowIcon(icon: ImageVector, modifier: Modifier = Modifier) {
    IconButton(
        onClick = { /* Handle arrow click if needed */ },
        modifier = modifier
    ) {
        Icon(imageVector = icon, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
    }
}

@Composable
fun HeaderHomePage() {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Top
    ) {
        // Box for Hamburger Menu and Date with Arrows
        Box(

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            HamburgerMenuIcon(onClick = {})
            ArrowsWithDateExample(modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Composable
fun TopPartHomePage(){
    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
        ) {
            HeaderHomePage()
            CalorieGraphs()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TopPartPreview() {
    AppTheme {
        TopPartHomePage()
    }
}

@Preview(showBackground = true)
@Composable
fun ArrowsWithDatePreview() {
    AppTheme {
        ArrowsWithDateExample()
    }
}

@Preview(showBackground = true)
@Composable
fun HamburgerMenuIconPreview() {
    AppTheme {
        HamburgerMenuIcon(onClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarContentPreview() {
    AppTheme {
        HeaderHomePage()
    }
}