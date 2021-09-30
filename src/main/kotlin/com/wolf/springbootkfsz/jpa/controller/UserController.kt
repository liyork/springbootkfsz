package com.wolf.springbootkfsz.jpa.controller

import com.wolf.springbootkfsz.jpa.dao.UserDao
import com.wolf.springbootkfsz.jpa.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// 简单查询
// http://localhost:8080/user/findAll
@RestController
@RequestMapping("/user")
class UserController {
    @Autowired lateinit var userDao: UserDao

    @GetMapping("/findAll")
    fun findAll(): List<User> {
        return userDao.findAll()
    }
}
