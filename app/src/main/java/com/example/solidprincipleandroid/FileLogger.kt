package com.example.solidprincipleandroid

import java.io.File

open class FileLogger {
    open fun logError(err: Exception) {
        val file = File("errors.txt")
        file.appendText(
            text = err.message.toString()
        )
    }
}

class CustomErrorLogger : FileLogger() {
    override fun logError(err: Exception) {
        val file = File("custom_error_logger.txt")
        file.appendText(
            text = err.message.toString()
        )
    }
}

class GoodErrorLogger : FileLogger() {
    override fun logError(err: Exception) {
        val file = File("good_error_logger.txt")
        file.appendText(
            text = err.message.toString()
        )
    }
}