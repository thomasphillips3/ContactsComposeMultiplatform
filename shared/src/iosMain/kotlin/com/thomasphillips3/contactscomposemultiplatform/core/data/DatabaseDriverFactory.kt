package com.thomasphillips3.contactscomposemultiplatform.core.data

import com.thomasphillips3.contactscomposemultiplatform.database.ContactDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver {
        return NativeSqliteDriver(ContactDatabase.Schema, "contact.db")
    }
}