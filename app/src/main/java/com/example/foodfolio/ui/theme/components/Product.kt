package com.example.foodfolio.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodfolio.ui.theme.PRODUCT_LIST


data class Product(val name: String, val kcal: Int)

@Composable
fun ProductPage() {
    Column {
        HeaderText(headerText = "Products")
        Column(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
            ProductItemList(products = PRODUCT_LIST)
        }
    }
}
@Composable
fun ProductItemList(products: List<Product>) {
    Scaffold(
        floatingActionButton = {
            AddButton(onClick = {})
        }
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            LazyColumn {
                items(products, key = { product -> product.name}) { product ->
                    ProductItem(product = product)
                }
            }
        }
    }
}
@Composable
fun AddButton(onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = onClick,
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.secondary,
        icon = { Icon(Icons.Filled.Add, "Add item button") },
        text = { Text(text = "Add item") },
    )
}

@Composable
fun ProductItem(product: Product) {
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
                Text(text = product.name, color = MaterialTheme.colorScheme.onPrimary, style = MaterialTheme.typography.labelLarge)
                Spacer(modifier =Modifier.size(4.dp))
                Text(text = "${product.kcal}kcal", color = MaterialTheme.colorScheme.onPrimary, style = MaterialTheme.typography.bodyMedium)
            }
            ProductEditIcons()
        }
    }
}
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
fun HeaderText(headerText: String) {
    Surface(
        color = MaterialTheme.colorScheme.background,
    ) {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Top
        ) {
            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                HamburgerMenuIcon(onClick = {})
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = headerText, color = MaterialTheme.colorScheme.primary, style = MaterialTheme.typography.headlineSmall)
                }

            }
        }
    }
}
@Preview
@Composable
fun HeaderPreview() {
    HeaderText("Products");
}

@Preview
@Composable
fun ProductItemPreview() {
    ProductItem(Product("Patat", 200))
}

@Preview
@Composable
fun ProductPagePreview() {
    ProductPage();
}

@Preview
@Composable
fun AddButtonPreview() {
    AddButton {

    }
}