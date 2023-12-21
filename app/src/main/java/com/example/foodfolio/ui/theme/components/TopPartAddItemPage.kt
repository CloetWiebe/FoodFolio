package com.example.foodfolio.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
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
fun HeaderAddItemPage() {
    Surface(
        color = MaterialTheme.colorScheme.background,
    ) {
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
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Add Item", color = MaterialTheme.colorScheme.primary, style = MaterialTheme.typography.headlineSmall)
                }

            }
        }
    }

}

@Composable
fun SelectSearchType(){
Row(
    Modifier.fillMaxWidth(),
    Arrangement.SpaceEvenly,
    verticalAlignment = Alignment.CenterVertically
) {
    Surface(
        color = MaterialTheme.colorScheme.primaryContainer,
        modifier = Modifier
            .weight(1f)
            .clickable { }
    ){
        Text(text = "Search product",modifier = Modifier.padding(8.dp), color= MaterialTheme.colorScheme.onPrimaryContainer, style = MaterialTheme.typography.bodyLarge)
    }
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .weight(1f)
            .clickable { }
    ){
        Text(text = "Search product",modifier = Modifier.padding(8.dp), color=MaterialTheme.colorScheme.onBackground, style = MaterialTheme.typography.bodyLarge)
    }
}
}

@Composable
fun SearchBar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.Search,
            contentDescription ="Search",
            tint = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .size(32.dp)
                .padding(end = 8.dp)
        )
        BasicTextField(
            value = "Search ...",
            textStyle = MaterialTheme.typography.labelLarge.copy(color = MaterialTheme.colorScheme.onBackground),
            onValueChange = {}
        )
}
}

@Composable
fun TopPartAddItem(){
    Column {
        HeaderAddItemPage()
        SelectSearchType()
        SearchBar()
    }
}
@Preview(showBackground = true)
@Composable
fun HeaderAddItemPagePreview() {
    AppTheme {
        HeaderAddItemPage()
    }
}

@Preview(showBackground = true)
@Composable
fun SelectSearchTypePreview(){
    AppTheme {
        SelectSearchType()
    }

}

@Preview(showBackground = true)
@Composable
fun SearchBarPreview(){
    AppTheme {
        SearchBar()
    }
}

@Preview(showBackground = true)
@Composable
fun TopPartAddItemPreview(){
    AppTheme {
        TopPartAddItem()
    }
}