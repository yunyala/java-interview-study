package com.yunya.demo;

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
