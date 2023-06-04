package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger配置
 *
 * @author : 杨世博
 * @date: Created in 19:56 2023/5/31
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                // 设置扫描路径
                .apis(RequestHandlerSelectors.basePackage("com.controller"))
                .build();
    }

//
//    /**
//     * 配置Docket实例
//     * @return
//     */
//    @Bean
//    public Docket getDocket(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(
//                        new ApiInfoBuilder()
//                                .contact(new Contact("听钱塘信来","https://blog.csdn.net/chenyunjiangNN","123@qq.com"))
//                                .title("Swagger在线文档")
//                                .build()
//                )
//                .groupName("demo-project-123");
//    }
}
