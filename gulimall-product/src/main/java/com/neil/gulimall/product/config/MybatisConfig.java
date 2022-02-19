package com.neil.gulimall.product.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.neil.gulimall.product.dao")
public class MybatisConfig {
}
