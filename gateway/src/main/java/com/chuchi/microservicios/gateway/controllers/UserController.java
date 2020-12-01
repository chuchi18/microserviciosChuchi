package com.chuchi.microservicios.gateway.controllers;

import com.chuchi.microservicios.gateway.domains.User;
import com.chuchi.microservicios.gateway.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value="/user/insert/{username}/{password}/{role}")
    public UserDetails saveUser(@PathVariable ("username") String username, @PathVariable("password") String password, @PathVariable("role") String role) {
        return this.userService.createUser(username, password, role);

    }

}
