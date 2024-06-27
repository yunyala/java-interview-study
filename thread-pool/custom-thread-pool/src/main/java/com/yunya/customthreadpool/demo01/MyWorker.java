package com.yunya.customthreadpool.demo01;

import java.util.List;

/**
 * @Description 需求:
 *         编写一个线程类,需要继承Thread类,设计一个属性,用于保存线程的名字;
 *         设计一个集合,用于保存所有的任务;
 * @Author yunyala
 * @Date 2024/6/27 23:37
 */
public class MyWorker extends Thread {

    private String name; // 线程名字

    private List<Runnable> tasks;

    public MyWorker(String name, List<Runnable> tasks) {
        super(name);
        this.tasks = tasks;
    }

    @Override
    public void run() {
        // 判断集合中是否有任务，只要有，就一直执行任务
        while (tasks.size() > 0) {
            Runnable runnable = tasks.remove(0);
            // thread类调用start方法启动线程时，实际上是会调用runnable接口实现类的run方法。具体可以看thread类的源码。
            runnable.run();
        }
    }
}
