package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);
//        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(MainBeanConfig.class);
//        Arrays.stream(ap.getBeanDefinitionNames()).forEach(System.out::println);
//        ap.close();
    }

}
