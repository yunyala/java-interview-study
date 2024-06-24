package com.yunya.javainterviewstudy.designPattern;

/**
 * @Description 单例模式-懒汉模式
 * @Author yunyala
 * @Date 2024/6/24 23:52
 */
public class SingletonLazyDemo {

    private static SingletonLazyDemo singletonLazyDemo;

    private SingletonLazyDemo() {
        System.out.println("单例模式-懒汉模式构造器执行私有构造方法");
    }

    public static SingletonLazyDemo getInstance() {
        if (singletonLazyDemo==null) {
            singletonLazyDemo = new SingletonLazyDemo();
        }
        return singletonLazyDemo;
    }

    public static void main(String[] args) {
        SingletonLazyDemo singletonLazyDemo1 = SingletonLazyDemo.getInstance();
        SingletonLazyDemo singletonLazyDemo2 = SingletonLazyDemo.getInstance();
        System.out.println(singletonLazyDemo1 == singletonLazyDemo2);
    }
}
