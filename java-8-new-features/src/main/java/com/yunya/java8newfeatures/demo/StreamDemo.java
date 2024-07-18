package com.yunya.java8newfeatures.demo;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Stream 是对Java集合框架的增强，提供了一种高效且易于使用的数据处理方式：流式操作
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("王五");
        System.out.println(arrayList); // [张三, 李四, 王五, 王五]
        // 使用stream流去重
        Stream<String> distinct = arrayList.stream().distinct();
        /**
         * 张三
         * 李四
         * 王五
         */
        distinct.forEach(System.out::println);
        // 计算arrayList的参数个数
        long count = arrayList.stream().count();
        System.out.println(count); // 4



    }
}
