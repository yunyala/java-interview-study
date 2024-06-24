package com.yunya.javainterviewstudy.designPattern;

/**
 * @Description 单例模式-饿汉式
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
