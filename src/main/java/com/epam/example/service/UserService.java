package com.epam.example.service;

import com.epam.example.model.User;
import com.epam.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Denis Iaichnikov
 * @since 7/2/2018
 */

@Service
public class UserService {

    private UserRepository userRepository;
    private OrderService orderService;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public List<User> getUsers() {
        return userRepository.getAllUsers();
    }

    public String hello() {
        return "Hello World";
    }

}
