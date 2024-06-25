package com.yunya.designpattern.StrategyPattern;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 12:15
 */
public class AlibabaPay extends PayStrategy{
    @Override
    void algorithmInterface() {
        System.out.println("支付宝支付");
    }
}
