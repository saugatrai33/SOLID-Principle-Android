package com.example.solidprincipleandroid

interface Authenticator {
    suspend fun signIn(email: String, password: String)
}

class FirebaseAuthenticator : Authenticator {
    override suspend fun signIn(email: String, password: String) {
        // login from firebase
    }
}

class CustomBackend : Authenticator {
    override suspend fun signIn(email: String, password: String) {
        // authentication from backend
    }
}

class GmailLogin : Authenticator {
    override suspend fun signIn(email: String, password: String) {
        // gmail login
    }
}