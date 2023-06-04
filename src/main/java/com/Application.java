package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author : 杨世博
 * @date: Created in 23:57 2023/5/30
 */
@SpringBootApplication(scanBasePackages = {"com.*"})
@MapperScan(basePackages = "com.mapper")
@EnableTransactionManagement
@EnableOpenApi
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
