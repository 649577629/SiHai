package cn.yj.sihai.config;

import cn.yj.sihai.config.constant.ConstantMethod;
import cn.yj.sihai.config.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * MVC配置
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 登录拦截器
     */
    @Resource
    private LoginInterceptor loginInterceptor;

    /**
     * 这个方法是用来配置静态资源映射的，比如html，js，css，等等
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //配置模板资源路径
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/");

        //静态文件地址映射
        registry.addResourceHandler("/static")
                .addResourceLocations("classpath:/static")
        ;

        //模板文件地址映射
        registry.addResourceHandler("/templates")
                .addResourceLocations("classpath:/templates")
        ;

        //API 页面加载映射
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

        //初始化项目常量参数
        ConstantMethod.initializeProjectConstantParameter();

    }

    /**
     * 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //在某访问路径下进入某拦截器
        registry.addInterceptor(loginInterceptor)
                //需要拦截的内容
                .addPathPatterns("/**")
                //不拦截设置
                .excludePathPatterns(
                        //API 页面
                        "/swagger-resources/**",
                        "/webjars/**",
                        "/v2/**",
                        "/swagger-ui.html/**",

                        //静态资源目录
                        "/static/**",

                        //错误页面
                        "/templates/error/**"

                )
        ;
    }

}
