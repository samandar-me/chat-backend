package com.sdk.routes

import com.sdk.model.Message
import com.sdk.model.Request
import com.sdk.util.BotResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun Route.botRoute() {
    post("/request") {
        val request = call.receive<Request>()
        val response = BotResponse.botResponse(request.request.lowercase())
        call.respond(
            HttpStatusCode.OK,
            Message(0,response, getCurrentTime())
        )
    }
}
private fun getCurrentTime(): String {
    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("HH:mm")
    return formatter.format(current)
}