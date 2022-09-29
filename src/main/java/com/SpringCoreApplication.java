package com;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        context.getBean(Pet.class).printAnimal();
    }

}
