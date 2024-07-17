package com.yunya.oop.demo;

/**
 * 线程等待demo
 *
 * public final void wait() throws InterruptedException：调用该方法会导致当前线程等待，直到另一个线程调用此对象的notify()方法或notifyAll()方法。
 *
 * ②、public final native void notify()：唤醒在此对象监视器上等待的单个线程。如果有多个线程等待，选择一个线程被唤醒。
 *
 * ③、public final native void notifyAll()：唤醒在此对象监视器上等待的所有线程。
 *
 * ④、public final native void wait(long timeout) throws InterruptedException：等待 timeout 毫秒，如果在 timeout 毫秒内没有被唤醒，会自动唤醒。
 *
 * ⑥、public final void wait(long timeout, int nanos) throws InterruptedException：更加精确了，等待 timeout 毫秒和 nanos 纳秒，如果在 timeout 毫秒和 nanos 纳秒内没有被唤醒，会自动唤醒。
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
