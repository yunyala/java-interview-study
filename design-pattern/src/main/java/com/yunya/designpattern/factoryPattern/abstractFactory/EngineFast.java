package com.yunya.designpattern.factoryPattern.abstractFactory;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 9:45
 */
public class EngineFast implements Engine{
    @Override
    public void run() {
        System.out.println("转得快");
    }
}
