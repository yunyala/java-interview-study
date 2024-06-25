package com.yunya.designpattern.adapterPattern;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 13:28
 */
public class AndroidHeadSet implements AndroidInterface{
    @Override
    public void androidHeadSet() {
        System.out.println("这里是使用安卓耳机接口的连接");
    }
}
