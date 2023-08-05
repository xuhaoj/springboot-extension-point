package com.jackxu.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;


@Component
public class JackBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //BeanFactoryPostProcessor用于修改beanfactory的属性值
        //beanfactory里面有BeanDefinition，可以修改BeanDefinition里面的值
        //BeanDefinition是一个bean的元数据的信息，有多少个bean就有多少个BeanDefinition
        beanFactory.getBeanDefinition("user").setAutowireCandidate(true);
        System.out.println("Jack的JackBeanFactoryPostProcessor ....");
    }

}