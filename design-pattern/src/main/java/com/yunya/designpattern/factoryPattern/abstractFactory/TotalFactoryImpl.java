package com.yunya.designpattern.factoryPattern.abstractFactory;

/**
 * @Description 总工厂实现类，由他决定调用哪个工厂的那个实例
 * @Author yunyala
 * @Date 2024/6/25 9:48
 */
public class TotalFactoryImpl implements TotalFactory{
    @Override
    public Car createCar() {
        return new CarA();
    }

    @Override
    public Engine createEngine() {
        return new EngineFast();
    }
}
