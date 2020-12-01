package com.chuchi.microservicios.gateway.services;

import com.chuchi.microservicios.gateway.domains.User;
import com.chuchi.microservicios.gateway.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
/*
    public Mono<User> login(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }*/

    public User createUser(String username, String password, String rol){
        Mono<UserDetails> fromDB = userRepository.findByUsername(username);
        UserDetails user = fromDB.block();

        if (user != null){
            User error = new User();
            error.setUsername("Nombre de usuario en uso");
            return error;
        }
        else{
            User newUser = new User(username,passwordEncoder.encode(password), "Usuarios");

            Set<SimpleGrantedAuthority> roles = new HashSet<SimpleGrantedAuthority>();
            SimpleGrantedAuthority newRole = new SimpleGrantedAuthority(rol);

            roles.add(newRole);
            newUser.setRoles(roles);
            Mono<User> saved = userRepository.save(newUser);
            return saved.block();
        }




    }
}
