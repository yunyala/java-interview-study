package com.yunya.springdi.constructor;

import com.yunya.springdi.constructor.entity.User;
import org.springframework.stereotype.Repository;

//@Repository
public class UserRepository {
    public void save(User user) {
        System.out.println("save user: " + user);
    }

    public void getUser() {
        System.out.println("getUser方法被执行了");
    }
}
