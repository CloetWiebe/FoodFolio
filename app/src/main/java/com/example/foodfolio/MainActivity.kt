package com.example.foodfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme
import com.example.foodfolio.ui.theme.components.BottomNavigationBar
import com.example.foodfolio.ui.theme.components.ShowSummary
import com.example.foodfolio.ui.theme.components.TopPartAddItem
import com.example.foodfolio.ui.theme.components.TopPartHomePage


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                AppTheme {
                    TopPartAddItem()
                }
            }
        }
    }

@Composable
private fun HomePage(){
    AppTheme {
        Scaffold(
            bottomBar = {BottomNavigationBar(iconSize = 32.dp)}
        ) {innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ){
                TopPartHomePage()
                ShowSummary()
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview(){
    HomePage()
}