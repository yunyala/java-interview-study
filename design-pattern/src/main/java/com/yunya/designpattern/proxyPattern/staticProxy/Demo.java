package com.yunya.designpattern.proxyPattern.staticProxy;

/**
 * 代理模式（Proxy Pattern）中，一个类代表另一个类的功能。
 * 代理模式通过引入一个代理对象来控制对原对象的访问。
 * 代理对象在客户端和目标对象之间充当中介，负责将客户端的请求转发给目标对象，同时可以在转发请求前后进行额外的处理。
 * 应用场景：Spring AOP、日志打印、异常处理、事务控制、权限控制等
 * @Description 代理模式
 * @Author yunyala
 * @Date 2024/6/25 10:26
 */
public class Demo {
    public static void main(String[] args) {
        // 不用代理的写法
//        UserDao userDao = new UserDao();
//        userDao.save();

        // 使用了静态代理的写法
        UserDao userDao1 = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao1);
        userDaoProxy.save();
    }
}
