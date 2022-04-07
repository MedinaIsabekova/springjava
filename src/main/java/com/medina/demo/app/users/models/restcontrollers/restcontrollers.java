package com.medina.demo.app.users.models.restcontrollers;

import com.medina.demo.app.users.models.User;
import com.medina.demo.app.users.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public Integer findById(@PathVariable("id")Integer id){
        return id;
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping
    public List<User>findAll(){
        return userService.findAll();
    }


}