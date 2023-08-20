package com.sdk.plugins

import com.sdk.routes.botRoute
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        botRoute()
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
