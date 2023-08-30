package src.main.java.springframework.factory.config;

public interface SingletoBeanRegistry {
    Object getSingleton(String beanName);
}
