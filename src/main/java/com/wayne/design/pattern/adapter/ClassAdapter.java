package com.wayne.design.pattern.adapter;

/**
 * 类适配器实现
 * @Author: waynechin
 * @Date: 2019/3/28 16:29
 */
public class ClassAdapter extends ClassAdapterSource implements AdapterTargetable {

    @Override
    public void method2() {
        System.out.println("this is Adapter method2!");
    }
}
