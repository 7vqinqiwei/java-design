package com.wayne.design.rpc.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class RpcRequst implements Serializable {

    private static final long serialVersionUID = -7052216249332111073L;

    //private String className;

    private @Setter
    @Getter
    String methodName;
    private @Setter
    @Getter
    Object[] parameters;


}
