package com.wolf.springbootkfsz.condition

/**
 * 业务bean
 */
class MagicServiceImpl : MagicService {
    override fun info(): String {
        return "this is matic"
    }
}

interface MagicService {
    fun info(): String
}