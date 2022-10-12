package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean {
    private String name;
    private Integer value;

    @Override
    public void destroy() throws Exception {
        System.out.println("inside destroy() method in " + this.getClass().getSimpleName() + " class");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside afterPropertiesSet() method in " + this.getClass().getSimpleName() + " class");
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
