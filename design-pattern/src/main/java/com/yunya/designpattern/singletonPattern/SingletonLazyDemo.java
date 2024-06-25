package com.yunya.designpattern.singletonPattern;

/**
 * 单例模式：保证一个类只有一个实例，并且提供一个访问该全局访问点
 * @Description 单例模式-懒汉模式：类初始化时,不会初始化该对象,真正需要使用的时候才会创建该对象,具备懒加载功能。
 * @Author yunyala
 * @Date 2024/6/24 23:52
 */
public class SingletonLazyDemo {

    private static SingletonLazyDemo singletonLazyDemo;

    private SingletonLazyDemo() {
        System.out.println("单例模式-懒汉模式构造器执行私有构造方法");
    }

    public synchronized static SingletonLazyDemo getInstance() {
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
