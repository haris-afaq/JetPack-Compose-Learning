package com.arish.jetpackcompose


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable

fun CounterApp(){

    var count by remember { mutableIntStateOf(value = 0) }

    Column {
        Text("$count",
            modifier = Modifier.padding(16.dp), color = colorResource(R.color.purple_700)
        )
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            Button(
            onClick = {
                count++

            }) {
            Text("Add")
        }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                count--
            }) {
                Text("Subtract")
            } }
    }

}