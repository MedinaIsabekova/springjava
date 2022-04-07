package com.medina.demo.app.users.models.services;

import com.medina.demo.app.users.models.User;
import com.medina.demo.app.users.repos.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();

    }

    public User create(User user){
        return userRepository.save(user);
    }
}
