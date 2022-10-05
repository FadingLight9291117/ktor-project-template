package cn.fadinglight.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.billRoute() {
    route("/bill") {
        get("getMonth") {
            call.respond(
                mapOf(
                    "name" to " 车亮召",
                    "age" to "23",
                )
            )
        }
        post("/create") {
        }
    }
}