package com.yunya.reflection.demo;

/**
 * @Description 通过反射创建对象
 * @Author yunyala
 * @Date 2024/7/16 23:45
 */
public class CreateObjByReflection {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.yunya.reflection.demo.Dog");
            Dog dog = (Dog) clazz.newInstance();
            dog.setName("旺财");
            dog.setAge(3);
            dog.eat();
            dog.sleep();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
