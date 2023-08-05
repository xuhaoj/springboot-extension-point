package com.jackxu.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class JackBeanPostProcessor implements BeanPostProcessor {


    //bean反射构造函数进行实例化之前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // 判断bean的名字为user才执行，因为每个bean实例化之前都会调这个结果
        if (beanName.equals("user")) {
            System.out.println(beanName + "JackBeanPostProcessor实例化之前执行");
            //todo 可以做一些事情
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }


    //bean反射构造函数进行实例化之后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 判断bean的名字为user才执行，因为每个bean实例化之后都会调这个结果
        if (beanName.equals("user")) {
            System.out.println(beanName + "JackBeanPostProcessor实例化之后执行");
            //todo 可以做一些事情
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

}