package com.yunya.springdi.config;

import com.yunya.springdi.config.entity.User;

public class UserRepository {
    public void save(User user) {
        System.out.println("save user: " + user);
    }

    public void getUser() {
        System.out.println("getUser方法被执行了");
    }
}
