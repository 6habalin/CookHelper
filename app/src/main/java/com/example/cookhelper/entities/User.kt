package com.example.cookhelper.entities

data class User(
    var name: String? = null,
    var email: String? = null,
    var password: String? = null
){
    constructor() : this(null, null, null)
}