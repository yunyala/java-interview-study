package com.yunya.java8newfeatures.demo;

public class MyInterfaceImpl implements MyInterface{

//    @Override
//    public void defaultMethod() {
//        MyInterface.super.defaultMethod();
//    }

    @Override
    public void eat() {
        System.out.println("eat...");
    }

    public static void main(String[] args)
    {
        MyInterface.staticMethod();
    }


}
