package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
public class BeanC {
    @Value("${bean.name}")
    private String name;
    @Value("${bean.value}")
    private String value;

    public void initMethod(){
        System.out.println(this.getClass().getSimpleName() + " class in initMethod()");
    }

    public void destroyMethod(){
        System.out.println(this.getClass().getSimpleName() + " class in destroyMethod()");
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
