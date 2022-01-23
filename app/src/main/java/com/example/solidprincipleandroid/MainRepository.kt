package com.example.solidprincipleandroid

import java.io.File

class MainRepository(
    private val auth: Authenticator, // login could be from any services
    private val logger: FileLogger
) {
    suspend fun logIn(userName: String, password: String) {
        try {
            auth.signIn(userName, password)
        } catch (e: Exception) {
            logger.logError(e)
        }
    }
}