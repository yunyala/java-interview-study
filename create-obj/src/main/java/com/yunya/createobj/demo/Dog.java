package com.yunya.createobj.demo;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/7/16 23:50
 */
public class Dog implements Cloneable, Serializable {

    public String name;

    public int age;

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
        System.out.println(name + "吃骨头");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
