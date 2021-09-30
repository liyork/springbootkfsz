package com.wolf.springbootkfsz.jpa.dao

import com.wolf.springbootkfsz.jpa.entity.Category
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface CategoryDao : JpaRepository<Category, Long> {
    // 若用原生sql则设定nativeQuery=true
    // entityName代替Category名称
    // searchText占位符
    @Query("select c from #{#entityName} c where c.name like %:searchText%")
    fun search(searchText: String, pageable: Pageable): Page<Category>
}
