package com.jxd.config;

import com.jxd.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jxd
 * @date 2021/11/8 21:52
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**", "/js/**", "/city","/insertCity","/user1/**");  // /**会将所有请求拦截，包括静态资源
    }
}
