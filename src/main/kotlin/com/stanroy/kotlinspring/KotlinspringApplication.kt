package com.stanroy.kotlinspring

import com.stanroy.kotlinspring.config.BlogProperties
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KotlinspringApplication

fun main(args: Array<String>) {
    runApplication<KotlinspringApplication>(*args)
}
