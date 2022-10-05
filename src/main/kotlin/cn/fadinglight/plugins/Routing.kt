package cn.fadinglight.plugins

import cn.fadinglight.routes.billRoute
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        route("/api/v1") {
            billRoute()
        }
    }
}
