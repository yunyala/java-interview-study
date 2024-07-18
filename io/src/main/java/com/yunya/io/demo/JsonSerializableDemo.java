package com.yunya.io.demo;

import com.alibaba.fastjson.JSON;

/**
 * Json序列化: 将对象转换为 JSON 格式的字符串，然后保存到文件或传输到其他系统。Java 中常用的 JSON 库有 Gson、Jackson 等。
 * 本案例用的是fastjson jar包
 */
public class JsonSerializableDemo {
    private String name;
    private int age;
    public JsonSerializableDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    // 重写toString
    @Override
    public String toString() {
        return "JsonSerializableDemo{\"name\":\"" + name + "\",\"age\":" + age + "}";
    }
    public static void main(String[] args) {
        JsonSerializableDemo demo = new JsonSerializableDemo("yunya", 18);
        System.out.println(demo);
        // 使用JSON序列化对象
        String json = JSON.toJSONString(demo);
        System.out.println("json序列化：" + json);

        // 反序列化
        JsonSerializableDemo jsonSerializableDemo2 = JSON.parseObject(json, JsonSerializableDemo.class);
        System.out.println("反序列化：" + jsonSerializableDemo2);
    }
}
