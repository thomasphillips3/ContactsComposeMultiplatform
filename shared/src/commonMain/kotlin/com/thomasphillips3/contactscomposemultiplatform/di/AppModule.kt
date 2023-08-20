package com.thomasphillips3.contactscomposemultiplatform.di

import com.thomasphillips3.contactscomposemultiplatform.contacts.domain.ContactDataSource

expect class AppModule {
    val contactDataSource: ContactDataSource
}