package src.main.java.springframework.factory;


import src.main.java.springframework.BeansException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {

    //无参的获取
    public Object getBean(String name) throws BeansException;

//    有参的获取 Bean对象
    public Object getBean(String name,Object... args) throws BeansException;

    /**
     * 按类型获取Bean对象
     *
     * @param name         Bean对象名称
     * @param requiredType Bean对象类型
     * @param <T>          Bean对象类型
     * @return Bean对象实例
     */
//    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
//
//    <T> T getBean(Class<T> requiredType) throws BeansException;

}
