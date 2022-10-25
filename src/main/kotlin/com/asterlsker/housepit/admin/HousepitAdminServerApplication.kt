package com.asterlsker.housepit.admin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HousepitAdminServerApplication

fun main(args: Array<String>) {
    runApplication<HousepitAdminServerApplication>(*args)
}
