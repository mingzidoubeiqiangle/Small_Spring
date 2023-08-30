package src.main.java.springframework.factory.support;

import src.main.java.springframework.BeansException;
import src.main.java.springframework.factory.BeanFactory;
import src.main.java.springframework.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory  extends DefaultSingletonBeanRegistry implements BeanFactory {

    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            //为什么可能是个null呢
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    //抽象类 模版
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
