package com.yunya.createobj.demo;

import java.io.*;

/**
 * @Description 创建对象的四种方法demo
 * @Author yunyala
 * @Date 2024/7/16 23:50
 */
public class CreateObjDemo {
    public static void main(String[] args) {
        // 1. 通过new关键字创建对象
        Dog dog = new Dog("小黑", 2);
        dog.eat();

        // 2. 通过反射，即类名.newInstance()创建对象
        try {
            Dog dog2 = Dog.class.newInstance();
            dog2.setName("小黄");
            dog2.setAge(3);
            dog2.eat();
        } catch (Exception e) {
            System.out.println("通过类名.newInstance()创建对象失败:" + e.getMessage());
        }

        // 3. 通过拷贝创建对象：clone 拷贝创建，通过 clone 方法创建对象，需要实现 Cloneable 接口并重写 clone 方法。
        try {
            Dog dog3 = (Dog) dog.clone();
            dog3.setName("小绿");
            dog3.setAge(4);
            dog3.eat();
        } catch (Exception e) {
            System.out.println("通过拷贝创建对象失败:" + e.getMessage());
        }

        // 4. 序列化机制创建，通过序列化将对象转换为字节流，再通过反序列化从字节流中恢复对象。需要实现 Serializable 接口。
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dog.txt"));
            oos.writeObject(dog);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dog.txt"));
            Dog dog4 = (Dog) ois.readObject();
            dog4.eat();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
