package com.example.solidprincipleandroid

import java.io.File

class MainRepository(
    private val auth: FirebaseAuth,
    private val logger: FileLogger
) {
    // two reasons to change this function
    // sign in method & logging
    // the correct version is given in next login method
    suspend fun signIn(userName: String, password: String) {
        try {
            auth.signIn(userName, password)
        } catch (e: Exception) {
            val file = File("errors.txt")
            file.appendText(
                text = e.message.toString()
            )
        }
    }

    // only one reason to change i.e. login method only
    suspend fun logIn(userName: String, password: String) {
        try {
            auth.signIn(userName, password)
        } catch (e: Exception) {
            logger.logError(e)
        }
    }
}