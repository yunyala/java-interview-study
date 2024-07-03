package com.yunya.demo;

/**
 * Java 枚举是一个特殊的类，一般表示一组常量，比如一年的 4 个季节，一年的 12 个月份，一个星期的 7 天，
 * 方向有东南西北等。
 * Java 枚举类使用 enum 关键字来定义，各个常量使用逗号 , 来分割。
 * 一般枚举值的定义是要根据你定义的构造方法来写，比如可以写RED，GREEN，BLUE，对应的构造方法是：ColorEnum() {}
 * 也可以写RED("红色")，GREEN("绿色")，BLUE("蓝色")，对应的构造方法是：ColorEnum(String val) { this.val = val;}
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(ColorEnum.RED);
        System.out.println("================");

        System.out.println(WeekEnum.MONDAY.getName());
        System.out.println(WeekEnum.MONDAY);
        System.out.println("================");

        System.out.println(RegistryEnum.THREAD_POOL_CONFIG_PARAMETER_LIST_KEY.getKey());
        System.out.println(RegistryEnum.THREAD_POOL_CONFIG_PARAMETER_LIST_KEY.getDesc());
    }

}
