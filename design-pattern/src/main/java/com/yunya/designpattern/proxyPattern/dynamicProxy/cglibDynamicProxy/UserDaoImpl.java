package com.yunya.designpattern.proxyPattern.dynamicProxy.cglibDynamicProxy;


/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 11:12
 */
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("保存数据方法");
    }
}
