package com.yunya.springdi.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 字段注入（Field Injection）
 */
//@Component
public class UserService {
    /**
     * 字段注入 UserRepository
     * 直接将依赖注入到类的字段上。Spring 在创建 Bean 实例时，会直接将依赖注入到标记了 @Autowired 的字段中。
      */
    @Autowired
    private UserRepository userRepository;

    public void getUser() {
        System.out.println("我是字段注入的UserRepository");
        userRepository.getUser();
    }
}
