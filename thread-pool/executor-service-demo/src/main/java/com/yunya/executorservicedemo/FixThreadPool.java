package com.yunya.executorservicedemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class FixThreadPool {

    public static void main(String[] args) {
        // 创建一个固定大小为 5 的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        // 提交多个任务到线程池中执行
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "线程正在执行");
                // 模拟执行任务时间
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        // 关闭线程池
        executorService.shutdown();
    }

}
