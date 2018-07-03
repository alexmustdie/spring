package com.epam.example.repository;

import com.epam.example.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @author Denis Iaichnikov
 * @since 7/2/2018
 */
@Repository
public class UserRepository {

    public List<User> getAllUsers() {
        return Collections.emptyList();
    }
}
