package com.wayne.design.pattern.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 11:48
 */
public class MyBridgeTest {

    @Test
    public void method() {
        BridgeWripper bridge = new MyBridge();

        bridge.setBridgeable(new BridgeSub1());
        bridge.method();

        bridge.setBridgeable(new BridgeSub2());
        bridge.method();

    }
}