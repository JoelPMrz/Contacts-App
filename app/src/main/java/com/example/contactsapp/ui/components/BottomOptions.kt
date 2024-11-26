package com.example.contactsapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.contactsapp.data.model.Contact

@Composable
fun BottomOptions(navController: NavController, contact : Contact, onConfirm: () -> Unit, negative : String, positive : String){
    Row(
        modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = negative,
            fontSize= 20.sp,
            modifier = Modifier.clickable {
                navController.popBackStack()
            }
        )
        Text(
            text = positive,
            fontSize= 20.sp,
            modifier = Modifier.clickable {
                onConfirm()
            }
        )
    }
}