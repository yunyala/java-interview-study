package com.yunya.oop.demo;

import java.util.HashMap;
import java.util.Objects;

/**
 * 重写equals方法，就要重写hashCode方法，理由是：
 * 哈希集合（如 HashMap、HashSet）依赖于对象的 hashCode() 方法来确定对象在内部存储结构中的位置。
 * 如果两个对象通过 equals() 方法被判断为相等，那么它们的 hashCode() 应该返回相同的值。
 * 如果没有正确重写 hashCode() 方法，即使两个对象在 equals() 方法下相等，它们的哈希码可能不同，
 * 导致它们被哈希集合视为不同的对象，从而产生问题。
 */
public class EqualsOverride {
    public static void main(String[] args) {
        Person person1 = new Person("张三", 18);
        Person person2 = new Person("张三", 18);
        System.out.println(person1.equals(person2));

        HashMap<Person, String> map = new HashMap<>();
        map.put(person1, "Person 1");
        // 这里因为Person类重写了equals和hashCode方法，所以person1和person2是相等的
        System.out.println(map.get(person2));
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
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
}
