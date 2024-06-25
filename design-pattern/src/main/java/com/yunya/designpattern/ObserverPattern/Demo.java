package com.yunya.designpattern.ObserverPattern;

/**
 * 观察者模式，是一种行为性模型，又叫发布-订阅模式，他定义对象之间一种一对多的依赖关系，使得当一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。
 * @Description 观察者模式
 * @Author yunyala
 * @Date 2024/6/25 12:32
 */
public class Demo {
    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject = new SubscriptionSubject();
        //创建微信用户
        WeixinUser user1 = new WeixinUser("杨枫");
        WeixinUser user2 = new WeixinUser("月儿");
        WeixinUser user3 = new WeixinUser("紫轩");
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("程序员啊的专栏更新了");
    }
}
