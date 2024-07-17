package com.yunya.oop.demo;

/**
 * 线程等待demo
 */
public class WaitDemo {
    public static void main(String[] args) {
        Object lock = new Object();
        new Thread(() -> {
            System.out.println("t1 start");
            synchronized (lock) {
                try {
                    System.out.println("t1 wait");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t1 被唤醒了");
            }
        }, "t1").start();

        new Thread(() -> {
            System.out.println("t3 start");
            synchronized (lock) {
                try {
                    System.out.println("t3 wait");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t3 被唤醒了");
            }
        }, "t3").start();

        new Thread(() -> {
            System.out.println("t2 start");
            synchronized (lock) {
                lock.notifyAll();
                System.out.println("t2 唤醒 t1与t2");
            }
        }, "t2").start();
    }
}
