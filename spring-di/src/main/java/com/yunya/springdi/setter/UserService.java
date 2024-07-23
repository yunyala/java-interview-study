package com.yunya.springdi.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 设值方法注入（Setter Injection）
 */
//@Component
public class UserService {
    private UserRepository userRepository;

    /**
     * 设值方法注入（Setter Injection）
     * 如果不加@Autowired注解，启动类启动时会报空指针异常，指向的是userRepository
     * @param userRepository
     */
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getUser() {
        System.out.println("我是设值方法注入的 UserRepository");
        userRepository.getUser();
    }
}
