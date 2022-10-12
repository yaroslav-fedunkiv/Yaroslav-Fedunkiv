package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanD {
    @Value("${bean.name}")
    private String name;
    @Value("${bean.value}")
    private Integer value;

    public void initMethod(){
        System.out.println(this.getClass().getSimpleName() + " class in initMethod()");
    }

    public void destroyMethod(){
        System.out.println(this.getClass().getSimpleName() + " class in destroyMethod()");
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
