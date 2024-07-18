package com.yunya.io.demo;

import java.io.*;

/**
 * 序列化demo：使用 Serializable 接口进行序列化
 * 在Java中，对象的序列化是将对象转换为字节流的过程，使得对象可以被保存到文件中或者通过网络进行传输，
 * 以便在需要时能够重新构造成原始对象。
 */
public class SerializableDemo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public SerializableDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "SerializableDemo [name=" + name + ", age=" + age + "]";
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableDemo sd = new SerializableDemo("张三", 20);
        System.out.println("序列化前：" + sd);

        // 将对象进行序列化：使用 ObjectOutputStream 将对象写入到文件或者其他输出流中。
        FileOutputStream fileOutputStream = new FileOutputStream("sd.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sd);
        objectOutputStream.close();
        System.out.println("序列化完成");

        // 反序列化：把序列化后的字符串转为对象。
        // 使用 ObjectInputStream 从文件或者其他输入流中读取对象的字节表示，并将其转换为原始对象。
        FileInputStream fileInputStream = new FileInputStream("sd.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializableDemo serializableDemo = (SerializableDemo) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("反序列化：" + serializableDemo);
    }
}
