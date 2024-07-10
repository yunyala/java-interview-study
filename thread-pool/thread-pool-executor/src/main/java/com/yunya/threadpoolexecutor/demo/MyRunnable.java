package com.yunya.threadpoolexecutor.demo;

public class MyRunnable implements Runnable{
    private String taskId;

    public MyRunnable(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行任务-" + taskId);
        // 模拟执行任务时间
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
