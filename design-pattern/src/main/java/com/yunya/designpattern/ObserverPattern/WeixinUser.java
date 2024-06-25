package com.yunya.designpattern.ObserverPattern;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 12:53
 */
public class WeixinUser implements Observer{

    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }

}
