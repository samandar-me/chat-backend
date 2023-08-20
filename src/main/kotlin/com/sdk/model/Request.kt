package com.sdk.model

import kotlinx.serialization.Serializable

@Serializable
data class Request(
    val request: String
)