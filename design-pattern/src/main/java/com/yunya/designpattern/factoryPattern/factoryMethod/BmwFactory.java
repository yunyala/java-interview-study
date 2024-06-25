package com.yunya.designpattern.factoryPattern.factoryMethod;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 9:28
 */
public class BmwFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
