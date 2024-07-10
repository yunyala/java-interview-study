package com.yunya.threadpoolexecutor.demo;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 使用无界队列创建线程池，可以无限制地将任务添加到队列中。
 * 这种方式可以避免由于任务过载而导致的拒绝策略触发，但是可能会导致内存耗尽的风险。
 */
public class LinkedBlockingQueueDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5,
                10,
                1,
                TimeUnit.MINUTES,
                new LinkedBlockingQueue<>()
        );
        for (int i = 0; i < 1000; i++) {
            // 创建任务
            MyRunnable myRunnable = new MyRunnable("" + i);
            // 执行任务
            threadPoolExecutor.execute(myRunnable);
        }
    }
}
