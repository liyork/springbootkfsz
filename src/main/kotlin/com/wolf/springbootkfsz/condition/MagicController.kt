package com.wolf.springbootkfsz.condition

import org.springframework.context.ApplicationContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MagicController {
    @GetMapping("magic")
    fun magic(): String {
        try {
            // 从spring容器中获取bean
            val magicService = SpringContextUtil.getBean("magicService") as MagicService
            return magicService.info()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return "null"
    }
}

object SpringContextUtil {
    lateinit var applicationContext: ApplicationContext
    fun setGlobalApplicationContext(context: ApplicationContext) {
        this.applicationContext = context
    }

    fun getBean(beanId: String): Any {
        return applicationContext.getBean(beanId)
    }
}