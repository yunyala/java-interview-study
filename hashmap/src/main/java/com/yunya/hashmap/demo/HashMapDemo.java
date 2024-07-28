package com.yunya.hashmap.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Object, Object> hashMap = new HashMap<>();
        hashMap.put("yunya01", "张三");
        hashMap.put("yunya02", "李四");
        hashMap.put("yunya03", "王五");
        // 添加元素，如果键存在则替换，返回以前与key关联的值。
        Object put = hashMap.put("yunya01", "张三2");
        System.out.println(put);    // 张三
        System.out.println(hashMap); // {yunya03=王五, yunya02=李四, yunya01=张三2}
        // V remove(Object key)：根据指定的键删除键值对。
        Object yunya01 = hashMap.remove("yunya01");
        System.out.println(yunya01);    // 张三2
        // 判断指定的键是否在集合中存在
        boolean yunya01_key_exist = hashMap.containsKey("yunya01");
        System.out.println(yunya01_key_exist);  // false
        boolean yunya02_key_exist = hashMap.containsKey("yunya02");
        System.out.println(yunya02_key_exist);  // true
        boolean yunya66_key_exist = hashMap.containsKey("yunya66");
        System.out.println(yunya66_key_exist);  // false
        // 判断指定的值是否在集合中存在
        boolean yunya02_val_exist = hashMap.containsValue("yunya02");
        System.out.println(yunya02_val_exist); // false
        boolean yunya02_val_exist2 = hashMap.containsValue("李四");
        System.out.println(yunya02_val_exist2); // true
        // 判断集合是否为空
        boolean empty = hashMap.isEmpty();
        System.out.println(empty); // false
        // 集合中元素的个数
        int size = hashMap.size();
        System.out.println(size);   // 2
        // 输出集合对象名称
        System.out.println(hashMap);    // {yunya03=王五, yunya02=李四}

        // 遍历集合
        // 使用第一种方式，遍历集合元素，先获取键的集合，再获取键所对应的值
        Set<Object> keySet = hashMap.keySet();
        for (Object key : keySet) {
            Object value = hashMap.get(key);
            System.out.println(key + "=" + value);
        }
        // 输出结果：
        // yunya03=王五
        // yunya02=李四

        // 使用第二种方式，先获取集合中键值对映射关系，再从映射关系中获得键和值
        Set<Map.Entry<Object, Object>> entrySet = hashMap.entrySet();
        for (Map.Entry<Object, Object> entry : entrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        // 输出结果：
        // yunya03=王五
        // yunya02=李四

        // 获取集合的所有值
        Collection<Object> values = hashMap.values();
        for (Object value : values) {
            System.out.println(value);
        }
        // 输出结果：
        // 王五
        // 李四
    }
}
