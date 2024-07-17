package com.yunya.oop.demo;

import java.util.HashMap;
import java.util.Objects;

/**
 * 这个案例演示的是重写了equals方法，而没有重写hashCode方法导致出现了问题。
 *
 *
 * 重写equals方法，就要重写hashCode方法，理由是：
 * 哈希集合（如 HashMap、HashSet）依赖于对象的 hashCode() 方法来确定对象在内部存储结构中的位置。
 * 如果两个对象通过 equals() 方法被判断为相等，那么它们的 hashCode() 应该返回相同的值。
 * 如果没有正确重写 hashCode() 方法，即使两个对象在 equals() 方法下相等，它们的哈希码可能不同，
 * 导致它们被哈希集合视为不同的对象，从而产生问题。
 */
public class EqualsOverrideWithoutHashCodeOverride {
    public static void main(String[] args) {
        Person person1 = new Person("张三", 18);
        Person person2 = new Person("张三", 18);
        System.out.println(person1.equals(person2)); // 输出true

        HashMap<Person, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(person1, "Person 1");

        // person2与person1在equals方法下是相等的，但由于没有重写hashCode方法，它们的哈希码不同
        // 因此person2不会覆盖person1，而是被视为不同的键
        System.out.println(objectObjectHashMap.get(person2)); // 输出null，因为person2并未被添加到map中

        // 添加p2到map中
        objectObjectHashMap.put(person2, "Person 2");

        // 此时p2被作为一个新的键加入到map中
        System.out.println(objectObjectHashMap.get(person1)); // 输出 "Person 1"，因为person1作为键仍然存在
        System.out.println(objectObjectHashMap.get(person2)); // 输出 "Person 2"
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Person person = (Person) obj;
            return age == person.age && name.equals(person.name);
        }

        /**
         * 重写hashCode方法
         * Objects.hash() 方法会接收多个参数，并根据这些参数生成一个哈希码。
         * 这里传入了 name 和 age，确保只有 name 和 age 相同的 Person1 对象会生成相同的哈希码。
         * @return
         */
//        @Override
//        public int hashCode() {
//            return Objects.hash(name, age);
//        }
    }
}
