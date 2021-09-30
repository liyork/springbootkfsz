package com.wolf.springbootkfsz.jpa.dao

import com.wolf.springbootkfsz.jpa.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserDao : JpaRepository<User, Long>
