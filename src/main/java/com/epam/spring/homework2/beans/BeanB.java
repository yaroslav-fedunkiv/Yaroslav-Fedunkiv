package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
public class BeanB {
    @Value("${bean.name}")
    private String name;
    @Value("${bean.value}")
    private Integer value;

    public void initMethod(){
        System.out.println(this.getClass().getSimpleName() + " class in initMethod()");
    }

    public void anotherInitMethod(){
        System.out.println("inside anotherInitMethod(), class " + this.getClass().getSimpleName());
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
