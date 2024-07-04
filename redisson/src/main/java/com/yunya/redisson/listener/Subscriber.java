package com.yunya.redisson.listener;

import org.redisson.Redisson;
import org.redisson.api.RTopic;
import org.redisson.api.RedissonClient;
import org.redisson.api.listener.MessageListener;
import org.redisson.config.Config;

public class Subscriber {
    public static void main(String[] args) {
        System.out.println("我是订阅者，我执行了，等待发布者发送消息给我...");
        // 创建 Redisson 客户端连接
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379");
        RedissonClient redissonClient = Redisson.create(config);

        // 获取订阅者对象
        RTopic myTopic = redissonClient.getTopic("myTopic");

        // 订阅消息
        myTopic.addListener(String.class, new MessageListener<String>() {
            @Override
            public void onMessage(CharSequence charSequence, String msg) {
                System.out.println("接收到消息：" + msg);
            }
        });

        // 阻塞主线程，保持订阅持续运行
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 关闭客户端连接
        redissonClient.shutdown();
    }
}
