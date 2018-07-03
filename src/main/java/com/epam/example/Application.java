package com.epam.example;

import com.epam.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Denis Iaichnikov
 * @since 7/2/2018
 */
@ComponentScan(basePackages = "com.epam.example")
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);

        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService.hello());

        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
