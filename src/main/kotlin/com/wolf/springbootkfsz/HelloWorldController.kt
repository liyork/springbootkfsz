package com.wolf.springbootkfsz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// http://localhost:8080
@RestController
class HelloWorldController {
    @GetMapping(value = ["", "/", "/hello"])  // 匹配请求的url列表
    fun hello(): Greeting {
        return Greeting(name = "world", greeting = "hello")
    }

    data class Greeting(var name: String, var greeting: String)
}
