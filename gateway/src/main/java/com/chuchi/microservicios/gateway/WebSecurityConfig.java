package com.chuchi.microservicios.gateway;

import com.chuchi.microservicios.gateway.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class WebSecurityConfig {

    @Autowired
    UserRepository userRepository;


    @Bean
    public ReactiveUserDetailsService userDetailsService() {
        return (username) -> userRepository.findByUsername(username);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        ServerHttpSecurity.AuthorizeExchangeSpec authorizeExchangeSpec = http.authorizeExchange().pathMatchers("/actuator/**").permitAll();

        authorizeExchangeSpec.and().csrf().disable().httpBasic();
        authorizeExchangeSpec.pathMatchers("/**").permitAll();
       // authorizeExchangeSpec.pathMatchers("/pago/**").hasRole("ADMIN");

        return http.build();
    }

}
