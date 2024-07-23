package com.yunya.springdi.constructor;

import org.springframework.stereotype.Component;

/**
 * 构造器注入（Constructor Injection）
 */
//@Component
public class UserService {
    private UserRepository userRepository;

    /**
     * 构造函数注入 UserRepository
     * 在类的构造器中通过参数进行注入依赖。Spring 在创建 Bean 实例时，会通过构造器的参数类型来自动装配所需的依赖。
      */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getUser() {
        System.out.println("我是构造函数注入的 UserRepository");
        userRepository.getUser();
    }
}
