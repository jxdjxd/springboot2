package com.jxd.boot;

import com.jxd.boot.bean.Pet;
import com.jxd.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * @author jxd
 * @date 2021/11/6 21:45
 */
// @SpringBootApplication标注这是一个SpringBoot应用，默认扫描启动类所在的包及其子包，可以使用scanBasePackage指定扫描路径
@SpringBootApplication(scanBasePackages = "com.jxd")
public class MainApplication {
    public static void main(String[] args) {
        // 返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        // 查看容器中的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

        // 注册的组件默认是单实例的
        Pet myCat = run.getBean("MyCat", Pet.class);
        Pet myCat1 = run.getBean("MyCat", Pet.class);
        System.out.println(myCat1 == myCat);

        // 配置类本身也是组件
        System.out.println(run.getBean(MyConfig.class));


    }
}
