package cn.yj.sihai.config.swagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Restful API 访问说明文档 访问路径:
 * http://IP:port/{context-path}/swagger-ui.html
 * 如:http://localhost:8080/XXX/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //创建扫描内容和分组情况.
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.regex("/.*"))
                .build()
                .groupName("SiHai")
                .apiInfo(apiInfo())
                ;
    }

    //API的基本信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 设置页面标题
                .title("API接口说明文档（基于RESTful协议）")
                // 设置联系人 昵称, 网址链接, 电子邮箱
                .contact(new Contact("蔡文斌", "www.baidu.com", "649577629@qq.com"))
                // 描述
                .description("司海系统API")
                // 定义版本号
                .version("1.0")
                .build();
    }
}
