package com.stephen.demos.springvault

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(Cred::class)
class SpringVaultApplication (private val cred: Cred) : CommandLineRunner {

    private val logger: Logger = LoggerFactory.getLogger(javaClass)
    override fun run(vararg args: String?) {
        logger.info("Username : ${cred.username} \t- Password : ${cred.password}")
    }
}

fun main(args: Array<String>) {
    runApplication<SpringVaultApplication>(*args)
}
