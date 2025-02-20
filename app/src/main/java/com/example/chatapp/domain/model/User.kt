package com.example.chatapp.domain.model

import com.google.firebase.firestore.DocumentId

data class User(
    @DocumentId
    val id: String? = null,
    val name: String,
    val email: String,
    val bio: String,
    val gender: Gender,
) {
    constructor() : this(null, "", "", "", Gender.Male)
}
