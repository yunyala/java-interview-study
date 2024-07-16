package com.yunya.reflection.demo;

/**
 * 获取Class对象的demo
 * Java中有一个名为Class的类，该类在运行时保留有关对象和类的所有信息。
 * Class对象描述了特定类的属性。该对象用于执行反射。
 */
public class GetClassDemo {
    public static void main(String[] args) {
        // 1.通过类名.class获取
        Class<Dog> dogClass = Dog.class;
        System.out.println(dogClass);

        // 2.通过对象.getClass()获取
        Dog dog = new Dog();
        Class<? extends Dog> dogClass1 = dog.getClass();
        System.out.println(dogClass1);

        // 3.通过Class.forName("全类名")获取
        try {
            Class<?> dogClass2 = Class.forName("com.yunya.reflection.demo.Dog");
            System.out.println(dogClass2);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 创建Class对象后，我们可以使用这些对象执行反射。
    }
}
