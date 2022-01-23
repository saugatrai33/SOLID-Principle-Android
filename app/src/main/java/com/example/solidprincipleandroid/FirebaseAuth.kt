package com.example.solidprincipleandroid

class FirebaseAuth {
    suspend fun signIn(username: String, password: String): String = "{'status': 'success'," +
            " 'data': ['name':'Saugat', age: 30]}"
}