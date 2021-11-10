package com.jxd.original;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用ServletRegistrationBean将原生的Servlet、Filter、Listener
 * @author jxd
 * @date 2021/11/10 13:17
 */
@Configuration(proxyBeanMethods = true)  //保证单实例
public class MyRegisterConfig {

    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet myServlet1 = new MyServlet();
        return new ServletRegistrationBean(myServlet1, "/my1");
    }
}
