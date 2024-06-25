package com.yunya.designpattern.factoryPattern.abstractFactory;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 9:45
 */
public class EngineSlow implements Engine{
    @Override
    public void run() {
        System.out.println("转得慢");
    }
}
