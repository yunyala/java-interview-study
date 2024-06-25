package com.yunya.designpattern.factoryPattern.abstractFactory;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 9:47
 */
public interface TotalFactory {
    Car createCar();
    Engine createEngine();
}
