package com.yunya.designpattern.proxyPattern.staticProxy;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 10:37
 */
public class UserDaoProxy extends UserDao{
    private UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("开启事务...");
        userDao.save();
        System.out.println("结束事务...");
    }

}
