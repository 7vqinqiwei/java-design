package com.wayne.design.pattern.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: waynechin
 * @Date: 2019/3/28 17:47
 */
public class SerializablePrototypeTest {

    @Test
    public void method(){
        MySimplePrototype mySimplePrototype = new MySimplePrototype();
        mySimplePrototype.value = 300;
        MySimplePrototype newObject = (MySimplePrototype) mySimplePrototype.cloneSelf();
        if(mySimplePrototype == newObject){
            System.out.println("this is a same object!");
        }
        newObject.value = 500;
        System.out.println(newObject.value);
    }

    @Test
    public void seri() throws Exception {
        String path = "D:/SerializablePrototype.instance";

        SerializablePrototype serializablePrototype = new SerializablePrototype();

        serializablePrototype.setI(23);
        serializablePrototype.setNotClone(50);

        serializablePrototype.writeToFile(path);

        SerializablePrototype newProtytype = SerializablePrototype.ReadFromFile(path);

        if(serializablePrototype == newProtytype){
            System.out.println("this is the same object!");
        }

        System.out.println(newProtytype.getI() + ":" + newProtytype.getNotClone());
    }
}