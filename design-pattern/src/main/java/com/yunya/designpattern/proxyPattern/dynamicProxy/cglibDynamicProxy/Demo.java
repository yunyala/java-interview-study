package com.yunya.designpattern.proxyPattern.dynamicProxy.cglibDynamicProxy;

/**
 * CGLIB动态代理：利用asm开源包，对代理对象类的class文件加载进来，通过修改其字节码生成子类来处理。
 * @Description CGLIB动态代理和jdk代理一样，使用反射完成代理，不同的是他可以直接代理类（jdk动态代理不行，他必须目标业务类必须实现接口），
 * CGLIB动态代理底层使用字节码技术，CGLIB动态代理不能对 final类进行继承。（CGLIB动态代理需要导入jar包）
 * @Author yunyala
 * @Date 2024/6/25 11:24
 */
public class Demo {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = (UserDao) cglibProxy.getInstance(new UserDaoImpl());
        userDao.save();
    }
}
