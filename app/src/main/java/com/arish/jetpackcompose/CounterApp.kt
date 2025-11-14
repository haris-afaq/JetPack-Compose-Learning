package com.arish.jetpackcompose


import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable

fun CounterApp(){

    var count by remember { mutableStateOf(value = 0) }

    Text("$count")

  Row {   Button(
      onClick = {
          count++

      }) {
      Text("Add")
  }

      Button(onClick = {
          count--
      }) {
          Text("Subtract")
      } }
}