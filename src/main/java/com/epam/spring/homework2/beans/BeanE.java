package com.epam.spring.homework2.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE {
    private String name;
    private Integer value;

    @PostConstruct
    public void postConstructMethod(){
        System.out.println(this.getClass().getSimpleName() + " class in postConstructMethod()");
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println(this.getClass().getSimpleName() + " class in preDestroyMethod()");
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
