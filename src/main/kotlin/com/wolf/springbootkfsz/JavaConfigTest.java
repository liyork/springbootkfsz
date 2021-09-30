package com.wolf.springbootkfsz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Description:
 * Created on 2021/9/30 8:54 AM
 *
 * @author 李超
 * @version 0.0.1
 */
@Configuration  // 标记为spring配置类
@ComponentScan(basePackages = {"com.wolf.springbootkfsz"})
@EnableWebMvc // 启用webmvc配置
public class JavaConfigTest extends WebMvcConfigurerAdapter {
    @Bean
    public BeanTest beanTest() {
        System.out.println("11111");
        return new BeanTest();
    }
}
