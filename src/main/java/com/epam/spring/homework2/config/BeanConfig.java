package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class BeanConfig {
    @DependsOn({"beanD"})
    @Bean(
            initMethod = "initMethod",
            destroyMethod = "destroyMethod"
    )
    BeanB beanB() {
        return new BeanB();
    }

    @DependsOn({"beanB"})
    @Bean(
            initMethod = "initMethod",
            destroyMethod = "destroyMethod"
    )
    BeanC beanC() {
        return new BeanC();
    }

    @Bean(
            initMethod = "initMethod",
            destroyMethod = "destroyMethod"
    )
    BeanD beanD() {
        return new BeanD();
    }
}
