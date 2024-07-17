package com.yunya.oop.demo;

/**
 * 字符串常量池demo
 */
public class StringConstantPoolDemo {
    public static void main(String[] args) {
        /**
         * String str1 = new String("abc") 和 String str2 = "abc" 的区别？
         * 直接使用双引号为字符串变量赋值时，Java 首先会检查字符串常量池中是否已经存在相同内容的字符串。
         * 如果存在，Java 就会让新的变量引用池中的那个字符串；如果不存在，它会创建一个新的字符串，放入池中，并让变量引用它。
         * 使用 new String("abc") 的方式创建字符串时，实际分为两步：
         * 第一步，先检查字符串字面量 "abc" 是否在字符串常量池中，如果没有则创建一个；如果已经存在，则引用它。
         * 第二步，在堆中再创建一个新的字符串对象，并将其初始化为字符串常量池中 "abc" 的一个副本。
         */
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2); // 输出 true，因为 s1 和 s2 引用的是字符串常量池中同一个对象。
        String s3 = new String("hello");
        System.out.println(s1 == s3); // 输出 false，因为 s3 是通过 new 关键字显式创建的，指向堆上不同的对象。
    }
}
