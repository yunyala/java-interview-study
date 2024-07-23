package com.yunya.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    protected UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    protected UserService userService() {
        return new UserService(userRepository());
    }

}
