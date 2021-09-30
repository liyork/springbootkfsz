package com.wolf.springbootkfsz.condition

import org.springframework.beans.factory.annotation.Configurable
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Conditional
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.wolf.springbootkfsz.condition"])
class ConditionalConfig {
    @Bean
    @Conditional(MagicCondition::class)  // 指定条件类
    fun magicService(): MagicService {
        return MagicServiceImpl()
    }
}