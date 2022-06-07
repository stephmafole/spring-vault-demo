package com.stephen.demos.springvault

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties
class SpringVaultApplication

fun main(args: Array<String>) {
    runApplication<SpringVaultApplication>(*args)
}
