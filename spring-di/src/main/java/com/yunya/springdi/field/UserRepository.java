package com.yunya.springdi.field;

import com.yunya.springdi.field.entity.User;
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
