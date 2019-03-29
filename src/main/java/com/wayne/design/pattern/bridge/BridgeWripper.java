package com.wayne.design.pattern.bridge;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 11:46
 */
public abstract class BridgeWripper {

    private @Setter@Getter Bridgeable bridgeable;

    public void method(){
        bridgeable.method();
    }

}
