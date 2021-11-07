package com.jxd.boot.config;

import com.jxd.boot.bean.Pet;
import com.jxd.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author jxd
 * @date 2021/11/6 22:46
 * Full(proxyBeanMethods = true)
 * Lite(proxyBeanMethods = false)
 * 解决组件依赖
 */
//@Conditional()
@Configuration(proxyBeanMethods = true)  //告诉SpringBoot这是一个配置类,等同于配置文件
public class MyConfig {
    @Bean //给容器中添加组件，以方法名作为组件的id,返回类型就是组件类型，返回的值就是组件在容器中的实例
    public User user01(){
        return new User("zhangsan", 18);
    }

    @Bean("MyCat") // 默认是单实例的
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }

}
