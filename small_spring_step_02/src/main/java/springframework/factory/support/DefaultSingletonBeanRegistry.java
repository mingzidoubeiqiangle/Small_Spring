package src.main.java.springframework.factory.support;

import src.main.java.springframework.factory.config.SingletoBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletoBeanRegistry {
    private Map<String, Object> singletonObjects = new HashMap<>();

    //他实现了 获取单例的方法 那么怎么实现的呢
    //直接使用本地的hashmap去获取对象 所以需要你再获取之前进行一个注册
    //你不注册我怎么进行获取呢

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    //这是一个受保护的方法 谁继承了我这个方法 也能使用我这个方法
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
