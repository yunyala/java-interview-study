package com.yunya.reflection.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 反射类Demo
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        // 创建Class对象
        Class<Cat> catClass = Cat.class;
        // ===============================查找由Cat实现的接口
        Class<?>[] interfaces = catClass.getInterfaces();
        for (Class<?> i : interfaces) {
            System.out.println("interface name:" + i.getName());
        }

        // ===============================以整数形式获取Cat的访问修饰符
        int modifiers = catClass.getModifiers();
        System.out.println("修饰符：" + Modifier.toString(modifiers)); // 修饰符：public

        // ===============================找到Cat的超类
        Class<?> superClass = catClass.getSuperclass();
        System.out.println("super class name of Cat:" + superClass.getName()); // super class name of Cat:java.lang.Object

        // ===============================找到Tiger的超类
        Class<Tiger> tigerClass = Tiger.class;
        Class<?> superClass2 = tigerClass.getSuperclass();
        System.out.println("super class name of tiger:" + superClass2.getName()); // super class name of tiger:com.yunya.reflection.demo.Cat

        // ===============================Java 反射与字段start===============================
        /**
         * getFields() - 返回该类及其超类的所有公共字段
         *
         * getDeclaredFields()  - 返回类的所有字段
         *
         * getModifier() - 以整数形式返回字段的修饰符
         *
         * set(classObject,value) - 使用指定的值设置字段的值
         *
         * get(classObject) - 获取字段的值
         *
         * setAccessible(boolean) - 使私有字段可访问
         *
         * 注意：如果我们知道字段名称，则可以使用
         *
         * getField("fieldName"） - 从类返回名称为fieldName的公共字段。
         *
         * getDeclaredField("fieldName"） - 从类返回名称为fieldName的字段。
         */
        // ===============================操纵Dog类的公共字段type
        Class<Dog> dogClass = Dog.class;
        Dog dog = new Dog();
        try {
            Field field = dogClass.getField("type");
            // 设置字段的值
            field.set(dog, "Dog");
            // 通过转换成字符串来获取字段的值
            String typeVal = (String) field.get(dog);
            System.out.println("Dog type: " + typeVal); // Dog type: Dog
            // 获取字段的访问修饰符
            int typeModifiers = field.getModifiers();
            System.out.println("字段type的修饰符: " + Modifier.toString(typeModifiers)); // 字段type的修饰符: public
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // ===============================访问私有字段
        Dog dog2 = new Dog();
        //创建类Class对象
        Class<? extends Dog> dog2Class = dog2.getClass();
        try {
            Field nameField = dog2Class.getDeclaredField("name");
            // 使私有字段可访问，如果没有这一步，则后续的设置会报错：java.lang.IllegalAccessException: Class com.yunya.reflection.demo.ReflectionDemo can not access a member of class com.yunya.reflection.demo.Dog with modifiers "private"
            nameField.setAccessible(true);
            // 设置值
            nameField.set(dog2, "小狗2号");
            // 获取值
            String nameVal = (String) nameField.get(dog2);
            System.out.println("Dog name: " + nameVal); // Dog name: 小狗2号
            // 获取字段的访问修饰符
            int nameModifiers = nameField.getModifiers();
            System.out.println("字段name的修饰符: " + Modifier.toString(nameModifiers)); // 字段name的修饰符: private
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // ===============================Java 反射与字段end===============================


        // ===============================Java 反射与方法start===============================
        /**
         * getMethods() - 返回该类及其超类的所有公共方法
         *
         * getDeclaredMethod() - 返回该类的所有方法
         *
         * getName() - 返回方法的名称
         *
         * getModifiers() - 以整数形式返回方法的访问修饰符
         *
         * getReturnType() - 返回方法的返回类型
         */
        // ===============================方法反射
        Dog dog3 = new Dog();
        Class<? extends Dog> dog3Class = dog3.getClass();
        // 使用getDeclaredMethod()获取所有方法
        Method[] dog3ClassDeclaredMethods = dog3Class.getDeclaredMethods();
        for (Method method : dog3ClassDeclaredMethods) {
            // 获取方法名称
            String methodName = method.getName();
            // 获取方法返回类型
            Class<?> returnType = method.getReturnType();
            // 获取方法访问修饰符
            int methodModifiers = method.getModifiers();
            System.out.println("方法名称：" + methodName + "，返回类型：" + returnType.getName() + "，访问修饰符：" + Modifier.toString(methodModifiers));
            // 方法名称：getName，返回类型：java.lang.String，访问修饰符：public
            //方法名称：setName，返回类型：void，访问修饰符：public
            //方法名称：sleep，返回类型：void，访问修饰符：public
            //方法名称：setAge，返回类型：void，访问修饰符：public
            //方法名称：getAge，返回类型：int，访问修饰符：public
            //方法名称：eat，返回类型：void，访问修饰符：public
        }
        // ===============================Java 反射与方法end===============================


        // ===============================Java 反射与构造函数start===============================
        /**
         * getConstructors() - 返回该类的所有公共构造函数以及该类的超类
         *
         * getDeclaredConstructor() -返回所有构造函数
         *
         * getName() - 返回构造函数的名称
         *
         * getModifiers() - 以整数形式返回构造函数的访问修饰符
         *
         * getParameterCount() - 返回构造函数的参数数量
         */
        // ===============================构造函数反射
        Dog dog4 = new Dog();
        Class<? extends Dog> dog4Class = dog4.getClass();
        // 使用getDeclaredConstructor()获取所有构造函数
        Constructor<?>[] dog4ClassDeclaredConstructors = dog4Class.getDeclaredConstructors();
        for (Constructor<?> constructor : dog4ClassDeclaredConstructors) {
            // 获取构造函数名称
            String constructorName = constructor.getName();
            // 获取构造函数参数数量
           int parameterCount = constructor.getParameterCount();
            // 获取构造函数访问修饰符
            int constructorModifiers = constructor.getModifiers();
            System.out.println("构造函数名称：" + constructorName + "，参数数量：" + parameterCount + "，访问修饰符：" + Modifier.toString(constructorModifiers));
            // 构造函数名称：com.yunya.reflection.demo.Dog，参数数量：0，访问修饰符：public
            //构造函数名称：com.yunya.reflection.demo.Dog，参数数量：2，访问修饰符：public
        }
        // ===============================Java 反射与构造函数end===============================

    }
}
