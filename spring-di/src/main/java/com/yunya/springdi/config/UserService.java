package com.yunya.springdi.config;

/**
 * Java 配置类注入（Java Config Injection）
 */
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getUser() {
        System.out.println("我是Java 配置类注入的 UserRepository");
        userRepository.getUser();
    }
}
