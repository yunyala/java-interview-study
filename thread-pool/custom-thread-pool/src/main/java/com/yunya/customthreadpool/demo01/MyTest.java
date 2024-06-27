package com.yunya.customthreadpool.demo01;

/**
 * @Description 测试类:
 *         1: 创建线程池类对象;
 *         2: 提交多个任务
 * @Author yunyala
 * @Date 2024/6/28 0:15
 */
public class MyTest {

    public static void main(String[] args) {
        // 1:创建线程池类对象
        MyThreadPool myThreadPool = new MyThreadPool(2, 4, 20);
        // 2:提交多个任务
        for (int i=0; i<30; i++) {
            // 3:创建任务对象，并提交给线程池
            MyTask my = new MyTask(i);
            myThreadPool.submit(my);
        }
    }

}
