package com.example.contactsapp.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.contactsapp.data.model.Contact

@Composable
fun ContactList(title: String, contactList : List<Contact>, navController: NavHostController){
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(start = 12.dp, top = 16.dp, bottom = 4.dp)
        )
    if(contactList.isNotEmpty()){
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(contactList) { contact ->
                ContactItem(
                    contact = contact,
                    onClick = { navController.navigate("details/${contact.id}") }
                )
            }
        }
    }
    else{
        NotContactItem(navController)
    }
}

