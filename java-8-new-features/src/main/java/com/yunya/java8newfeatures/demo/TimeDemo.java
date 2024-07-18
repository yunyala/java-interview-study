package com.yunya.java8newfeatures.demo;

/**
 * Java 8 引入了一个全新的日期和时间 API，位于java.time包中。这个新的 API 纠正了旧版java.util.Date类中的许多缺陷。
 */
public class TimeDemo {
    public static void main(String[] args)
    {
        // 获取当前日期和时间
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println("当前日期和时间：" + now);

        // 获取当前日期
        java.time.LocalDate today = java.time.LocalDate.now();
        System.out.println("当前日期：" + today);

        // 获取当前时间
        java.time.LocalTime time = java.time.LocalTime.now();
        System.out.println("当前时间：" + time);

        // 获取当前日期和时间，并格式化为：年月日 时分秒
        java.time.LocalDateTime now1 = java.time.LocalDateTime.now();
        System.out.println("当前日期和时间，并格式化为：年月日 时分秒：" + now1.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
