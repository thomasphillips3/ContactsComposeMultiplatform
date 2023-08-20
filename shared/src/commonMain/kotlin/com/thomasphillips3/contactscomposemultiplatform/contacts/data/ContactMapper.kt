package com.thomasphillips3.contactscomposemultiplatform.contacts.data

import com.thomasphillips3.contactscomposemultiplatform.contacts.domain.Contact
import com.thomasphillips3.contactscomposemultiplatform.core.data.ImageStorage
import database.ContactEntity

suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let { imageStorage.getImage(it) }
    )
}