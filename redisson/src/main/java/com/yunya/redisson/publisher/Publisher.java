package com.yunya.redisson.publisher;

import org.redisson.Redisson;
import org.redisson.api.RTopic;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class Publisher {

    public static void main(String[] args) {
        System.out.println("发布者运行了");
        // 创建 Redisson 客户端连接
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379");
        RedissonClient redissonClient = Redisson.create(config);

        // 获取发布者对象
        RTopic myTopic = redissonClient.getTopic("myTopic");

        // 发布消息
        myTopic.publish("Hello, Redisson!");

        // 关闭Redisson客户端连接
        redissonClient.shutdown();
    }

}
