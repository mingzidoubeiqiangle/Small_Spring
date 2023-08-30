package src.test.java.springframework.test;

import src.main.java.springframework.BeansException;
import src.main.java.springframework.factory.config.BeanDefinition;
import src.main.java.springframework.factory.BeanFactory;
import org.junit.Test;
import src.main.java.springframework.factory.support.DefaultListableBeanFactory;
import test.java.springframework.test.bean.UserService;

public class ApiTest {


    @Test
    public void test_BeanFactory() throws BeansException {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
