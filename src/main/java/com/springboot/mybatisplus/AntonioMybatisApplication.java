package com.springboot.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.springboot.mybatisplus.mapper")//扫描自定义的Mapper接口，并注入对应的SqlSession实例
public class AntonioMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntonioMybatisApplication.class, args);
	}

}
