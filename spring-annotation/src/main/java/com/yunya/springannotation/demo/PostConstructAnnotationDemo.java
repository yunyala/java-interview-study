package com.yunya.springannotation.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostConstructAnnotationDemo {

    private String configuration;

    public PostConstructAnnotationDemo() {
        System.out.println("我是构造方法PostConstructAnnotation");
    }

    /**
     * 注解@PostConstruct生效场景：必须是在SpringBoot启动类启动了，才会自动执行；
     * 如果你自己在非springboot启动类启动的情况下，实例化该类，这个方法不会自动执行！！！
     */
    @PostConstruct
    public void init() {
        System.out.println("我是用注解@PostConstruct标注的方法，我在类实例化时自动执行");
        this.configuration = "default configuration";
    }

    public void say() {
        System.out.println("我是一个普通方法say");
        System.out.printf("类的变量：%s", configuration);
    }

    public static void main(String[] args)
    {
        System.out.println("使用注解@PostConstruct测试案例");
        // 非springboot启动类启动的情况下，实例化PostConstructAnnotation类，被@PostConstruct标注的方法不会自动执行！！！
        PostConstructAnnotationDemo postConstructAnnotation = new PostConstructAnnotationDemo();
        postConstructAnnotation.say();
    }

}
