package com.yunya.thread.demo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
        // 使用 CountDownLatch 可以很方便地实现主线程等待所有子线程完成后再继续执行的控制逻辑。
        System.out.println("使用 CountDownLatch 可以很方便地实现主线程等待所有子线程完成后再继续执行的控制逻辑。");
        CountDownLatch countDownLatch = new CountDownLatch(2); // 这里如果设置为3，则主线程会一直等待，哪怕所有子线程都完成任务了，还是会阻塞。永远执行不完。
        new Thread(new MyRunnable(countDownLatch)).start();
        new Thread(new MyRunnable(countDownLatch)).start();
        // 主线程调用 await() 方法来等待，直到 CountDownLatch 的计数器为0，表示所有子线程都已经完成了任务。
        countDownLatch.await();
        // 所有子线程完成任务后，主线程继续执行
        System.out.println("All tasks are completed. Main thread continues.");
    }

    static class MyRunnable implements Runnable {

        private final CountDownLatch countDownLatch;

        public MyRunnable(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " worker run");
            try {
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " has completed its task.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                // 任务完成后调用countDown()方法，调用 countDown() 方法来减少 CountDownLatch 的计数。
                countDownLatch.countDown();
            }
        }
    }

}
