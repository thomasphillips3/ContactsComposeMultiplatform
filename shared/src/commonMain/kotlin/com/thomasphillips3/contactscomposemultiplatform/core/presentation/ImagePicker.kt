package com.thomasphillips3.contactscomposemultiplatform.core.presentation

import androidx.compose.runtime.Composable

expect class ImagePicker {

    @Composable
    fun registerPicker(onImagePicked: (ByteArray) -> Unit)

    fun pickImage()
}