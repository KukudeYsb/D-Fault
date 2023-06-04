package com.config;

import com.authority.JwtInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器
 *
 * @author : 杨世博
 * @date: Created in 23:40 2023/6/1
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JwtInterceptor())
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/user/register")
                .addPathPatterns("/**");
    }
}
