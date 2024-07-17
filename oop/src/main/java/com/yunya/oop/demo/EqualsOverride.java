package com.yunya.oop.demo;

import java.util.Objects;

/**
 * 重写equals方法，就要重写hashCode方法
 */
public class EqualsOverride {
    public static void main(String[] args) {
        Person person1 = new Person("张三", 18);
        Person person2 = new Person("张三", 18);
        System.out.println(person1.equals(person2));
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
