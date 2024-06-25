package com.yunya.designpattern.singletonPattern;

/**
 * 单例模式：保证一个类只有一个实例，并且提供一个访问该全局访问点
 * @Description 单例模式-饿汉式：类初始化时,会立即加载该对象，线程天生安全,调用效率高。
 * @Author yunyala
 * @Date 2024/6/24 18:50
 */
public class SingletonHungryDemo {

    // 定义一个静态变量存放类，类初始化时会立即加载该对象，线程安全
    private static SingletonHungryDemo singletonDemo = new SingletonHungryDemo();

    private SingletonHungryDemo() {
        System.out.println("单例模式-饿汉模式构造器执行私有构造方法");
    }

    public static SingletonHungryDemo getInstance() {
        return singletonDemo;
    }

    public static void main(String[] args) {
        SingletonHungryDemo singletonDemo1 = SingletonHungryDemo.getInstance();
        SingletonHungryDemo singletonDemo2 = SingletonHungryDemo.getInstance();
        System.out.println(singletonDemo1 == singletonDemo2);
    }

}
