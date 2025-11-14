package com.arish.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ToggleScreen(modifier: Modifier = Modifier) {
    var isChecked by remember { mutableStateOf(value = false) }

   Row(modifier = Modifier.fillMaxSize().background(color = Color.White),
       verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.Center) {
       Checkbox(
           checked = isChecked,
           onCheckedChange = {isChecked = it
println("Clicked")
           }
       )
       Text(if(isChecked)"Checked" else "Unchecked")

   }
}


@Composable
@Preview
fun TogglePreview(){
    ToggleScreen()
}




