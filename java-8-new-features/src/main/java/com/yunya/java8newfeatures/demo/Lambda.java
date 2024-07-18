package com.yunya.java8newfeatures.demo;

/**
 * Lambda 表达式描述了一个代码块（或者叫匿名方法），可以将其作为参数传递给构造方法或者普通方法以便后续执行。
 */
public class Lambda {
    public static void main(String[] args) {
        // 不使用Lambda表达式，写一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Thread1");
            }
        }).start();
        // 使用Lambda表达式，写一个线程
        new Thread(() -> System.out.println("Hello Thread2")).start();


    }
}
