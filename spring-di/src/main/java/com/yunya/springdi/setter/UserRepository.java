package com.yunya.springdi.setter;

import com.yunya.springdi.setter.entity.User;
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
