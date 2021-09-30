package com.wolf.springbootkfsz.condition

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * 启动类
 * http://localhost:8080/magic
 */
@SpringBootApplication
class DemoConditionalBeanApplication

fun main(args: Array<String>) {
    val context = runApplication<DemoConditionalBeanApplication>(*args)
    SpringContextUtil.setGlobalApplicationContext(context)
}