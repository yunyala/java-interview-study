package com.yunya.javainterviewstudy.designPattern;

/**
 * @Description 单例模式-饿汉式
 * @Author yunyala
 * @Date 2024/6/24 18:50
 */
public class SingletonDemo {

    // 定义一个静态变量存放类，类初始化时会立即加载该对象，线程安全
    private static SingletonDemo singletonDemo = new SingletonDemo();

    private SingletonDemo() {
        System.out.println("SingletonDemo私有构造方法");
    }

    public static SingletonDemo getInstance() {
        return singletonDemo;
    }

    public static void main(String[] args) {
        SingletonDemo singletonDemo1 = SingletonDemo.getInstance();
        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
        System.out.println(singletonDemo1 == singletonDemo2);
    }

}
