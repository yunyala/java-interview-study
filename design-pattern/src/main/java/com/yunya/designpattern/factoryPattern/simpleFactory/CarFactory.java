package com.yunya.designpattern.factoryPattern.simpleFactory;

/**
 * @Description 简单工厂 ：用来生产同一等级结构中的任意产品。（不支持拓展增加产品）
 * @Author yunyala
 * @Date 2024/6/25 8:43
 */
public class CarFactory {
    public static Car createCar(String carName) {
        if("".equals(carName)) {
            return null;
        }
        if(carName.equals("奥迪")) {
            return new Aodi();
        }
        if(carName.equals("宝马")) {
            return new Bmw();
        }
        return null;
    }
}
