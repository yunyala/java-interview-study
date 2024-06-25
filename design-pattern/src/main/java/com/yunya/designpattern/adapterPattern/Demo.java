package com.yunya.designpattern.adapterPattern;

/**
 * 适配器允许将一个类的接口转换成客户所期望的另一个接口。适配器模式可以在不修改现有代码的情况下，
 * 能够使得原本由于接口不兼容而不能一起工作的类能够协同工作，它提供了一种灵活的方式来集成和使用不同接口的类。
 * @Description 适配器类能够将IphoneInterface接口的调用转发给AndroidHeadSet类的实现
 * @Author yunyala
 * @Date 2024/6/25 13:30
 */
public class Demo {
    public static void main(String[] args) {
        // 直接通过苹果接口 使用苹果耳机
        IphoneInterface iPhoneInterface = new IPhoneHeadSet();
        iPhoneInterface.iphoneHeadSet();

        //通过对象的适配器进行连接
        AndroidInterface androidInterface = new AndroidHeadSet();
        ObjectHeadSetAdapter objectHeadSetAdapter = new ObjectHeadSetAdapter(androidInterface);
        objectHeadSetAdapter.iphoneHeadSet();
    }
}
