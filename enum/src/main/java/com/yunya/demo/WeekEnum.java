package com.yunya.demo;

public enum WeekEnum {

    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private final String name;

    WeekEnum(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}
