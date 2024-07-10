package com.yunya.threadpoolexecutor.demo;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 优先级队列, 根据任务的优先级顺序执行。优先级队列允许你指定任务的执行顺序。
 */
public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                0,
                4,
                1,
                TimeUnit.MINUTES,
                new PriorityBlockingQueue<>()
        );
        // 方案1.1：引用内部任务类MyRunnable
        for (int i=0; i<10; i++) {
            final int taskId = i;
            final int priority = i % 3; // 模拟不同的任务优先级
            threadPoolExecutor.execute(new MyRunnable(taskId, priority));
        }
        // 方案1.2：引用内部任务类MyRunnable
//        threadPoolExecutor.execute(new MyRunnable(1, 1));
//        threadPoolExecutor.execute(new MyRunnable(2, 10));
//        threadPoolExecutor.execute(new MyRunnable(3, 3));

        // 方案二：引用外部任务类MyComparableRunnable
//        threadPoolExecutor.execute(new MyComparableRunnable(1, 1));
//        threadPoolExecutor.execute(new MyComparableRunnable(2, 10));
//        threadPoolExecutor.execute(new MyComparableRunnable(3, 5));

        // 结束线程池
        threadPoolExecutor.shutdown();
    }

    // 定义一个任务类
    static class MyRunnable implements Runnable, Comparable<MyRunnable> {
        private final int taskId;
        private final int priority;

        public MyRunnable(int taskId, int priority) {
            this.taskId = taskId;
            this.priority = priority;
        }

        public void run() {
            System.out.println("Task " + taskId + " with priority " + priority + " executed by " + Thread.currentThread().getName());
        }

        public int compareTo(MyRunnable other) {
            // 根据优先级比较任务，优先级高的排在前面
            return Integer.compare(other.priority, this.priority);
        }
    }
}
