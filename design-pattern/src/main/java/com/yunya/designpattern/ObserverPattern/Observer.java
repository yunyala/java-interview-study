package com.yunya.designpattern.ObserverPattern;

/**
 * @Description 观察者的接口，用来存放观察者共有方法
 * @Author yunyala
 * @Date 2024/6/25 12:33
 */
public interface Observer {
    // 观察者方法
    void update(String message);
}
