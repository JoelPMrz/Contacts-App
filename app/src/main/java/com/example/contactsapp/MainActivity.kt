package com.example.contactsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Text
import com.example.contactsapp.navegation.Navigator
import com.example.contactsapp.ui.theme.ContactsAppTheme
import com.example.contactsapp.viewmodel.ContactViewModel
import com.example.contactsapp.viewmodel.ContactViewModelFactory
import android.content.Context

class MainActivity : ComponentActivity() {

    private val contactViewModel: ContactViewModel by viewModels {
        ContactViewModelFactory(applicationContext)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ContactsAppTheme {
                Navigator(viewModel = contactViewModel)
            }
        }
    }
}
