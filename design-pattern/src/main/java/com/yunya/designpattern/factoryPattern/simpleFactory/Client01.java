package com.yunya.designpattern.factoryPattern.simpleFactory;

/**
 * 简单工厂 ：用来生产同一等级结构中的任意产品。（不支持拓展增加产品）
 * @Description 简单工厂模式相当于是一个工厂中有各种产品，创建在一个类中，客户无需知道具体产品的名称，
 * 只需要知道产品类所对应的参数即可。但是工厂的职责过重，而且当类型过多时不利于系统的扩展维护。
 * @Author yunyala
 * @Date 2024/6/25 8:45
 */
public class Client01 {
    public static void main(String[] args) {
        System.out.println("简单工厂...");
        Car aodi = CarFactory.createCar("奥迪");
        Car bmw = CarFactory.createCar("宝马");
        aodi.run();
        bmw.run();
    }
}
