package com.yunya.java8newfeatures.demo;

import java.util.Optional;

/**
 * 引入Optional防止空指针异常，可以提高代码的可读性和健壮性。
 */
public class OptionalDemo {
    public static void main(String[] args)
    {
        // 可以使用静态工厂方法 Optional.of()、Optional.ofNullable() 或者 Optional.empty() 来创建 Optional 对象。
        Optional<String> yunya = Optional.of("yunya");
        // 使用 isPresent() 方法来检查 Optional 对象是否包含非 null 的值。
        System.out.println(yunya.isPresent()); // true
        // 使用 get() 方法来获取 Optional 对象中的值（前提是 Optional 对象确实包含非 null 的值）。
        System.out.println(yunya.get()); // yunya
        // 使用 orElse() 方法可以在 Optional 对象不包含值时提供一个默认值。
        System.out.println(yunya.orElse("yunya2")); // yunya

        Optional<Object> obj = Optional.ofNullable(null);
        System.out.println(obj.isPresent()); // false
        System.out.println(obj.orElse("default val")); // default val

        Optional<Object> emptyObj = Optional.empty();
        System.out.println(emptyObj.isPresent()); // false

    }
}
