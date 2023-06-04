package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 配置中心
 *
 * @author : 杨世博
 * @date: Created in 19:48 2023/5/31
 */
@Configuration
public class ConfigCenter {
    /**
     * Druid数据源配置
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
}
