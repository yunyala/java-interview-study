package com.yunya.customthreadpool.demo01;

/**
 * @Description 需求:
 *         自定义线程池练习,这是任务类,需要实现Runnable;
 *         包含任务编号,每一个任务执行时间设计为0.2秒
 * @Author yunyala
 * @Date 2024/6/27 23:21
 */
public class MyTask implements Runnable {

    private int id;

    public MyTask(int id) {
        this.id = id;
    }

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("线程:"+name+" 即将执行任务:"+id);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程:"+name+" 完成了任务:"+id);
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "id=" + id +
                '}';
    }

}
