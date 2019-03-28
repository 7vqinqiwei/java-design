package com.wayne.design.pattern.prototype;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 16:23
 */
public class MySimplePrototype implements MyPrototype,Cloneable {

    int value;

    /**
     * 原型模式 主要是提供一个方法复制自身
     * 应用： 记录当前实例的各种状态等
     * @return
     */
    @Override
    public Object cloneSelf() {
        MySimplePrototype self = new MySimplePrototype();
        self.value = value;
        return self;
    }

    /**
     * 使用 java 自带的支持的原型方法
     * @param args
     * @throws CloneNotSupportedException
     */
    /*
    public static void main(String[] args) throws CloneNotSupportedException {

        MySimplePrototype mySimplePrototype = new MySimplePrototype();
        mySimplePrototype.value = 300;
        MySimplePrototype newObject = (MySimplePrototype) mySimplePrototype.clone();
        if(mySimplePrototype == newObject){
            System.out.println("this is a same object!");
        }
        newObject.value = 500;
        System.out.println(newObject.value);

    }*/

}
