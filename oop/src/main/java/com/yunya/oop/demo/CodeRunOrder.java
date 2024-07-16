package com.yunya.oop.demo;

/**
 * @Description new子类的时候，子类和父类静态代码块，构造方法的执行顺序
 * @Author yunyala
 * @Date 2024/7/17 0:21
 */
public class CodeRunOrder {
    public static void main(String[] args) {
        Child child = new Child();
        /**
         * 控制台输出结果：
         * Parent static block
         * Child static block
         * Parent constructor
         * Child constructor
         */
    }
}

class Parent {
    static {
        System.out.println("Parent static block");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static block");
    }

    public Child() {
        System.out.println("Child constructor");
    }
}
