package com.codecriticon.adminserver

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAdminServer
class AdminserverApplication

fun main(args: Array<String>) {
    runApplication<AdminserverApplication>(*args)
}
