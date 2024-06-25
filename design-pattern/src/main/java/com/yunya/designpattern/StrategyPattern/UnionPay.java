package com.yunya.designpattern.StrategyPattern;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 12:16
 */
public class UnionPay extends PayStrategy{
    @Override
    void algorithmInterface() {
        System.out.println("银联支付");
    }
}
