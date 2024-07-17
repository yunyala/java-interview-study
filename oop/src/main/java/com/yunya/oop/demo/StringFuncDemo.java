package com.yunya.oop.demo;

/**
 * String类常用函数demo
 */
public class StringFuncDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("o", 5));
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.lastIndexOf("o", 5));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(5));
        System.out.println(str.replace("o", "O"));
        System.out.println(str.replace("o", "O").replace("l", "L"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.concat("!"));
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("d"));
        System.out.println(str.contains("o"));
        System.out.println(str.contains("orld"));
        System.out.println(str.isEmpty());
        System.out.println(str.equals("Hello World"));
        System.out.println(str.equalsIgnoreCase("hello world"));
        System.out.println(str.compareTo("Hello World"));
        System.out.println(str.compareToIgnoreCase("hello world"));
        // split用法：根据给定正则表达式的匹配拆分此字符串。
        String[] strs = str.split(" ");
        for (String s : strs) {
            System.out.println(s);
        }
    }
}
