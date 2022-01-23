package com.example.solidprincipleandroid

import java.io.File

class FileLogger {

    fun logError(err: Exception) {
        val file = File("errors.txt")
        file.appendText(
            text = err.message.toString()
        )
    }

}