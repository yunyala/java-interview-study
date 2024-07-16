package com.yunya.reflection.demo;

/**
 * 老虎--猫的子类
 */
public class Tiger extends Cat {
    public static void main(String[] args) {
        System.out.println("Tiger");
        Class<Tiger> tigerClass = Tiger.class;
        Class<?>[] interfaces = tigerClass.getInterfaces();
        for (Class<?> item : interfaces) {
            // 这里虽然Cat类实现了两个接口Animal和Mammal，但是Tiger类只继承了Cat类，所以这里只打印了Cat类
            System.out.println("tiger class:" + item.getName());
        }
    }
}
