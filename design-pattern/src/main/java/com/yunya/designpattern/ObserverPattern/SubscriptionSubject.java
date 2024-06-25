package com.yunya.designpattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 12:56
 */
public class SubscriptionSubject implements Subject {

    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
