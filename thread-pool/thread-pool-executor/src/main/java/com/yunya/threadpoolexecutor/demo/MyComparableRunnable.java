package com.yunya.threadpoolexecutor.demo;

public class MyComparableRunnable implements Runnable, Comparable<MyComparableRunnable> {

    private int taskId;

    private int priority;

    public MyComparableRunnable(int taskId, int priority) {
        this.taskId = taskId;
        this.priority = priority;
    }

    @Override
    public int compareTo(MyComparableRunnable other) {
        // 优先级高的排在前
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public void run() {
        System.out.println("taskId: " + taskId + ", priority: " + priority + " executed by " + Thread.currentThread().getName());
    }
}
