package com.thomasphillips3.contactscomposemultiplatform.di

import com.thomasphillips3.contactscomposemultiplatform.contacts.data.SqlDelightContactDataSource
import com.thomasphillips3.contactscomposemultiplatform.contacts.domain.ContactDataSource
import com.thomasphillips3.contactscomposemultiplatform.core.data.DatabaseDriverFactory
import com.thomasphillips3.contactscomposemultiplatform.core.data.ImageStorage
import com.thomasphillips3.contactscomposemultiplatform.database.ContactDatabase

actual class AppModule {

    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory().create()
            ),
            imageStorage = ImageStorage()
        )
    }
}