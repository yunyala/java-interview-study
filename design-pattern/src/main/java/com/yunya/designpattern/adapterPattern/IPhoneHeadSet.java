package com.yunya.designpattern.adapterPattern;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 13:28
 */
public class IPhoneHeadSet implements IphoneInterface{
    @Override
    public void iphoneHeadSet() {
        System.out.println("这里是使用lightning接口耳机的连接");
    }
}
