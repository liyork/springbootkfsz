package com.wolf.springbootkfsz.jpa.controller

import com.wolf.springbootkfsz.jpa.dao.CategoryDao
import com.wolf.springbootkfsz.jpa.entity.Category
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

// 分页
// http://localhost:8080/category/page?pageNo=0&pageSize=3
// http://localhost:8080/category/search?searchText=计算机&pageNo=0&pageSize=3
@RestController
@RequestMapping("/category")
class CategoryController {
    @Autowired
    lateinit var categoryDao: CategoryDao

    @GetMapping("/page")
    fun findAll(
        @RequestParam(value = "pageNo", defaultValue = "0") pageNo: Int,
        @RequestParam(value = "pageSize", defaultValue = "10") pageSize: Int
    ): Page<Category> {
        return categoryDao.findAll(PageRequest.of(pageNo, pageSize))
    }

    // 模糊查询
    @GetMapping("/search")
    fun search(
        @RequestParam(value = "searchText", defaultValue = "") searchText: String,
        @RequestParam(value = "pageNo", defaultValue = "0") pageNo: Int,
        @RequestParam(value = "pageSize", defaultValue = "10") pageSize: Int
    ): Page<Category> {
        return categoryDao.search(searchText, PageRequest.of(pageNo, pageSize))
    }
}
