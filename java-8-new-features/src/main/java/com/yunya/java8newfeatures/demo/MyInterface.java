package com.yunya.java8newfeatures.demo;

/**
 * 接口新特性：Java 8 允许在接口中添加默认方法和静态方法。
 * 默认方法和静态方法不要求一定要被实现类重写，因为他们本身已经有方法体了。
 */
public interface MyInterface {
    default void defaultMethod() {
        System.out.println("defaultMethod");
    }

    void eat();

    static void staticMethod() {
        System.out.println("staticMethod");
    }

}
