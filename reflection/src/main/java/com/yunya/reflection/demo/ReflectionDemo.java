package com.yunya.reflection.demo;

import java.lang.reflect.Modifier;

/**
 * 反射类Demo
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        // 创建Class对象
        Class<Cat> catClass = Cat.class;
        // 查找由Cat实现的接口
        Class<?>[] interfaces = catClass.getInterfaces();
        for (Class<?> i : interfaces) {
            System.out.println("interface name:" + i.getName());
        }

        // 以整数形式获取Cat的访问修饰符
        int modifiers = catClass.getModifiers();
        System.out.println("修饰符：" + Modifier.toString(modifiers)); // 修饰符：public

        // 找到Cat的超类
        Class<?> superClass = catClass.getSuperclass();
        System.out.println("super class name of Cat:" + superClass.getName()); // super class name of Cat:java.lang.Object

        // 找到Tiger的超类
        Class<Tiger> tigerClass = Tiger.class;
        Class<?> superClass2 = tigerClass.getSuperclass();
        System.out.println("super class name of tiger:" + superClass2.getName()); // super class name of tiger:com.yunya.reflection.demo.Cat
    }
}
