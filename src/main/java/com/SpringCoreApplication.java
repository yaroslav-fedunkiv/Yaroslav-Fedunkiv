package com;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.config.MainBeanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(MainBeanConfig.class);
        System.out.println(context.getBean(BeanB.class));
    }

}
