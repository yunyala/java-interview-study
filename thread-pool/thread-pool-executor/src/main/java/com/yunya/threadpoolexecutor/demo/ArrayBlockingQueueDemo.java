package com.yunya.threadpoolexecutor.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 使用有界队列，限制了可以添加到队列中的最大任务数，超出部分的任务将触发拒绝策略。
 */
public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5,
                10,
                1,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(5)
        );
        for (int i=0; i<10; i++) {
            // 写法一：
//            MyRunnable myRunnable = new MyRunnable("" + i);
//            threadPoolExecutor.execute(myRunnable);

            // 写法二：
            final int finalI = i;
            threadPoolExecutor.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行任务: " + finalI);
                }
            });
        }
        // 等待所有线程都执行完
        while (threadPoolExecutor.getActiveCount() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 关闭线程池
        threadPoolExecutor.shutdown();
    }
}
