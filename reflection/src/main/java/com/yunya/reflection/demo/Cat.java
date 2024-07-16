package com.yunya.reflection.demo;

public class Cat implements Animal, Mammal{
    @Override
    public void display() {
        System.out.println("I am a Cat.");
    }

    @Override
    public void makeSound() {
        System.out.println("Miao miao");
    }
}
