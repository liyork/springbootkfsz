package com.wolf.springbootkfsz.condition

import org.springframework.context.annotation.Condition
import org.springframework.context.annotation.ConditionContext
import org.springframework.core.env.get
import org.springframework.core.type.AnnotatedTypeMetadata

/**
 * 是否创建magicbean的条件
 */
class MagicCondition : Condition {
    override fun matches(context: ConditionContext, metadata: AnnotatedTypeMetadata): Boolean {
        val env = context.environment
        // 检查application.properties配置是否存在magic属性
        if (env.containsProperty("magic")) {
            val b = env["magic"]
            return b == "true"
        }
        return false
    }
}