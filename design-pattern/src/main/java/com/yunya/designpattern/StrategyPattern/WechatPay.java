package com.yunya.designpattern.StrategyPattern;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 12:15
 */
public class WechatPay extends PayStrategy{
    @Override
    void algorithmInterface() {
        System.out.println("微信支付");
    }
}
