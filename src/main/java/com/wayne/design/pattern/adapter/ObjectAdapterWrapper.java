package com.wayne.design.pattern.adapter;

/**
 * @Author: waynechin
 * @Date: 2019/3/28 16:37
 */
public class ObjectAdapterWrapper implements AdapterTargetable {

    private ClassAdapterSource source;

    public ObjectAdapterWrapper(ClassAdapterSource source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is a ObjectAdapterWrapper method2!");
    }
}
