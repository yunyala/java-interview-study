package com.yunya.designpattern.factoryPattern.abstractFactory;

/**
 * 抽象工厂 ：用来生产不同产品族的全部产品。（不支持拓展增加产品；支持增加产品族）
 * @Description 抽象工厂简单地说是工厂的工厂，抽象工厂可以创建具体工厂，由具体工厂来产生具体产品。
 * @Author yunyala
 * @Date 2024/6/25 9:42
 */
public class Client {
    public static void main(String[] args) {
        TotalFactoryImpl totalFactory1 = new TotalFactoryImpl();
        Car car = totalFactory1.createCar();
        car.run();

        TotalFactoryImpl totalFactory2 = new TotalFactoryImpl();
        Engine engine = totalFactory2.createEngine();
        engine.run();
    }
}
