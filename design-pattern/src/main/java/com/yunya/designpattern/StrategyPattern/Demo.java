package com.yunya.designpattern.StrategyPattern;

/**
 * 在策略模式定义了一系列算法或策略，并将每个算法封装在独立的类中，
 * 使得它们可以互相替换。通过使用策略模式，可以在运行时根据需要选择不同的算法，而不需要修改客户端代码。
 * 解决在多种相似算法存在时，使用条件语句（如if...else）导致的复杂性和难以维护的问题。
 * 例如：不同课程不同播放规则：人脸识别、算数识别次数和位置不同
 * @Description 策略模式
 * @Author yunyala
 * @Date 2024/6/25 12:07
 */
public class Demo {

    public static void main(String[] args) {
        Context context;
        context = new Context(new WechatPay());
        context.algorithmInterface();

        context = new Context(new AlibabaPay());
        context.algorithmInterface();

        context = new Context(new UnionPay());
        context.algorithmInterface();
    }

}
