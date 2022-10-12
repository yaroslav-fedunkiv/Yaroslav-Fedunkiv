package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.*;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@Import({BeanConfig.class})
public class MainBeanConfig {
    @Lazy
    @Bean
    BeanF beanF() {
        return new BeanF();
    }

    @Bean
    BeanA beanA() {
        return new BeanA();
    }

    @Bean
    BeanE beanE() {
        return new BeanE();
    }

    @Bean
    BeanFactoryPostProcessorImpl beanFactoryPostProcessor(){
        return new BeanFactoryPostProcessorImpl();
    }

    @Bean
    ValidationBean validateBean(){
        return new ValidationBean();
    }

}
