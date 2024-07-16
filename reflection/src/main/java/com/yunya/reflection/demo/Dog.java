package com.yunya.reflection.demo;

/**
 * 小狗类
 */
public class Dog {

    private String name;

    private int age;

    public String type;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("小狗喜欢吃东西");
    }

    public void sleep() {
        System.out.println("小狗喜欢睡觉");
    }

}
