package com.yunya.oop.demo;

/**
 * String转Integer
 */
public class String2IntegerDemo {
    public static void main(String[] args) {
        /**
         * String 转成 Integer，主要有两个方法：
         * Integer.parseInt(String s)
         * Integer.valueOf(String s)
         */
        String str = "123";
        int i = Integer.parseInt(str);
        int i2 = Integer.valueOf(str);
        System.out.println(i);
        System.out.println(i2);
    }
}
