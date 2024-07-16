package com.yunya.threadpoolexecutor.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {
    private static final int CORE_POOL_SIZE = 2;
    private static final int MAX_POOL_SIZE = 5;
    private static final int QUEUE_CAPACITY = 20;
    private static final long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
        //通过ThreadPoolExecutor构造函数自定义参数创建
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                // CallerRunsPolicy 是一种简单的拒绝策略。当线程池无法接受新的任务时，它会将该任务退回给调用者，
                // 也就是当前提交任务的线程会执行这个任务。
                // 其他的内置拒绝策略包括 AbortPolicy（默认策略，会抛出异常）、
                // DiscardPolicy（静默丢弃任务）、
                // DiscardOldestPolicy（丢弃最老的任务）等，每种策略都有其适用的场景和特点。
                new ThreadPoolExecutor.CallerRunsPolicy()
//                new ThreadPoolExecutor.AbortPolicy()
        );

        for (int i = 1; i <= 20; i++) {
            // 创建任务
            MyRunnable myRunnable = new MyRunnable("" + i);
            // 执行任务：ThreadPoolExecutor 提供了两种方法来提交任务给线程池执行：submit() 和 execute() 方法。
            // 返回值类型：submit() 返回一个 Future 对象，可以用于获取任务执行结果或者异常信息；execute() 是 void，没有返回值。
            // 异常处理：submit() 方法能够捕获任务执行过程中的异常并封装在 Future 中，而 execute() 方法无法直接捕获任务执行中的异常。
            // 适用场景：如果需要获取任务执行的结果或者处理任务执行过程中的异常，应使用 submit() 方法；如果只是执行简单的任务，不需要关心返回值或者异常处理，可以使用 execute() 方法。
            threadPoolExecutor.execute(myRunnable);
        }

        //终止线程池
        threadPoolExecutor.shutdown();

        // 等待线程池所有任务都执行完成：executor.isTerminated() 是 ExecutorService 接口提供的方法，用于检查线程池是否已经终止。
        // 当且仅当所有任务都已完成（包括已提交但未执行的任务），并且线程池已经调用了 shutdown() 方法后，该方法返回 true。
        while (!threadPoolExecutor.isTerminated()) {
        }

        System.out.println("Finished all threads");
    }
}
