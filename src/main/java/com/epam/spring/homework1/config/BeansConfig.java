package com.epam.spring.homework1.config;

import com.epam.spring.homework1.beans.BeanA;
import com.epam.spring.homework1.beans.BeanB;
import com.epam.spring.homework1.beans.BeanC;
import com.epam.spring.homework1.other.OtherBeanA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan("com.epam.spring.homework1.beans")
@Import({OtherConfig.class})
@Configuration
public class BeansConfig {

//    @Bean
//    public BeanA createBeanA(){
//        return new BeanA();
//    }
//    @Bean
//    public BeanB createBeanB(){
//        return new BeanB();
//    }
//    @Bean
//    public BeanC createBeanC(){
//        return new BeanC();
//    }



}
