//package com.epam.example.config;
//
//import com.epam.example.repository.UserRepository;
//import com.epam.example.service.OrderService;
//import com.epam.example.service.UserService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//
///**
// * @author Denis Iaichnikov
// * @since 7/2/2018
// */
//@Configuration
//@Import(OrderConfig.class)
//public class UserConfig {
//
//    @Bean
//    public UserService userService(UserRepository userRepository, OrderService orderService) {
//        return new UserService(userRepository, orderService);
//    }
//
//    @Bean
//    public UserRepository userRepository() {
//        return new UserRepository();
//    }
//
//
//
//}
