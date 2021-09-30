package com.wolf.springbootkfsz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootkfszApplication

fun main(args: Array<String>) {
    println("spring boot start...")
    runApplication<SpringbootkfszApplication>(*args)
}
