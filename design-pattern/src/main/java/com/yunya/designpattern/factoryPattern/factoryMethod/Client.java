package com.yunya.designpattern.factoryPattern.factoryMethod;

/**
 * 工厂方法 ：用来生产同一等级结构中的固定产品。（支持拓展增加产品）
 * @Description 工厂方法模式Factory Method，又称多态性工厂模式。在工厂方法模式中，核心的工厂类不再负责所有的产品的创建，而是将具体创建的工作交给子类去做。
 * 该核心类成为一个抽象工厂角色，仅负责给出具体工厂子类必须实现的接口，而不接触哪一个产品类应当被实例化这种细节
 * @Author yunyala
 * @Date 2024/6/25 9:29
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("工厂方法...");
        Car aodi = new AodiFactory().createCar();
        Car bmw = new BmwFactory().createCar();
        aodi.run();
        bmw.run();
    }
}
