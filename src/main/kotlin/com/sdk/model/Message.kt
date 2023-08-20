package com.sdk.model

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val userId: Int,
    val msg: String,
    val time: String
)