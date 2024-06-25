package com.yunya.designpattern.StrategyPattern;

/**
 * @Description 定义上下文维护算法策略
 * @Author yunyala
 * @Date 2024/6/25 12:17
 */
public class Context {

    PayStrategy payStrategy;

    public Context(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void algorithmInterface() {
        payStrategy.algorithmInterface();
    }

}
