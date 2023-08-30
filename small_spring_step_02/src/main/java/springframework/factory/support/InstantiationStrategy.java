package src.main.java.springframework.factory.support;


import src.main.java.springframework.BeansException;
import src.main.java.springframework.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface  InstantiationStrategy{

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
