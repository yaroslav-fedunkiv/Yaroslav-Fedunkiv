package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class ValidationBean implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (!isValid(bean)) {
            System.out.println(beanName + " ==> not valid");
        } else {
            System.out.println(beanName + " ==> valid");
        }
        return bean;
    }

    private boolean isValid(Object bean) {
        try {
            Field fieldName = bean.getClass().getDeclaredField("name");
            fieldName.setAccessible(true);
            Field fieldValue = bean.getClass().getDeclaredField("value");
            fieldValue.setAccessible(true);

            String name = (String) fieldName.get(bean);
            Integer value = (Integer) fieldValue.get(bean);

            if (name == null || (value == null || value <= 0)){
                return false;
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return false;
        }
        return true;
    }
}
