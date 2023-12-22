package com.example.foodfolio.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme

@Composable
fun AddItemListItem(itemInfo: String) {
    val (itemName, itemCalories) = itemInfo.split(":")
    Surface(
        color = MaterialTheme.colorScheme.primary,
        shape = RoundedCornerShape(8.dp), // Adjust the radius as needed
        modifier = Modifier
            .padding(vertical = 8.dp) // Add more space between items vertically
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = itemName,
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.labelLarge
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = itemCalories,
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun AddItemList(){
    val myItems = listOf("Kotelet:602kcal", "Pudding:300kcal", "Hamburger:700kcal", "Appel:50kcal", "Chocolade:100kcal", "Yoghurt:80kcal")
    Column(
        Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        LazyColumn {
            items(items = myItems) { item -> AddItemListItem(itemInfo = item) }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddItemListPreview(){
    AppTheme {
        AddItemList()
    }
}