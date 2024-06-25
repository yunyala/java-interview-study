package com.yunya.designpattern.adapterPattern;

/**
 * @Description TODO
 * @Author yunyala
 * @Date 2024/6/25 13:28
 */
public class ObjectHeadSetAdapter implements IphoneInterface{

    private AndroidInterface androidInterface;

    public ObjectHeadSetAdapter(AndroidInterface androidInterface) {
        this.androidInterface = androidInterface;
    }

    @Override
    public void iphoneHeadSet() {
        androidInterface.androidHeadSet();
    }
}
