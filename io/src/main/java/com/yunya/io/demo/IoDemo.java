package com.yunya.io.demo;

import org.springframework.core.io.ResourceLoader;

import java.io.*;

/**
 * Java IO demo
 * Java IO（输入输出）是 Java 编程中处理文件和数据流的重要部分。
 * Java 中的 IO 操作主要围绕输入流和输出流展开，用于读取数据到程序或者将程序数据写入到外部持久存储（如文件或网络连接）。
 */
public class IoDemo {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = ResourceLoader.class.getClassLoader().getResourceAsStream("iofile/file.txt");
        // 处理获取的 InputStream
        if (inputStream != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } else {
            System.out.println("文件未找到或无法读取。");
        }
    }
}
