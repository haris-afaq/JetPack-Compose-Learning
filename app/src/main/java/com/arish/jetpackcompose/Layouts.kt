package com.arish.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnWidget(modifier: Modifier = Modifier) {
Column (modifier = Modifier.fillMaxSize(),
    horizontalAlignment =  Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
    ){
    Text("Column Widget")
    Spacer(modifier = Modifier.height(15.dp))
    Button(onClick = {}) {
        Text("Button")
    }
}
}

@Composable
@Preview(showSystemUi = true)
fun ColumnLayoutPreview(modifier: Modifier = Modifier) {
    ColumnWidget()
}