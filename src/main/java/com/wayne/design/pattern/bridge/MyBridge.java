package com.wayne.design.pattern.bridge;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 11:47
 */
public class MyBridge extends BridgeWripper {
    @Override
    public void method() {
        getBridgeable().method();
    }
}
