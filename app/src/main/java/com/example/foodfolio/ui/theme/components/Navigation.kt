package com.example.foodfolio.ui.theme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.foodfolio.ui.theme.PRODUCT_LIST

@Composable
fun Navigation(navController: NavHostController, route: String) {
    NavHost(navController = navController, startDestination = route) {
        composable("home") {
            Column {
                TopPartHomePage()
                ShowSummary(PRODUCT_LIST)
            }

        }
        composable("add") {
            Column {
                TopPartAddItem()
                AddItemList()
            }
        }
        composable("scan") {

        }
        composable("recipe") {

        }
        composable("product") {
            ProductPage();
        }

    }
}