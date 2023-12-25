package com.example.foodfolio.ui.theme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme
import com.example.foodfolio.ui.theme.PRODUCT_LIST

@Composable
private  fun ProductEditIcons(){
    Column {
        IconButton(
            onClick = {},
        ) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = "Hamburger Menu",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
        IconButton(
            onClick = {},
        ) {
            Icon(
                imageVector = Icons.Outlined.Delete,
                contentDescription = "Hamburger Menu",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Composable
fun SummaryTitle(){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(8.dp)

    ) {
        Text(text = "Summary", color = MaterialTheme.colorScheme.primary, style = MaterialTheme.typography.titleLarge)
    }
}

@Composable
fun ShowSummary(items: List<Product>){
    Column(
        Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        SummaryTitle()
        LazyColumn {
            items(items = items) { item -> ProductItem(item) }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun SummaryListItemPreview() {
    AppTheme {
        ProductItem(Product("Kotelet", 602))
    }
}

@Preview(showBackground = true)
@Composable
fun SummaryTitlePreview(){
    AppTheme {
        SummaryTitle()
    }
}

@Preview(showBackground = true)
@Composable
fun ShowSummaryPreview(){
    AppTheme {
        ShowSummary(PRODUCT_LIST)
    }
}