package com.wayne.design.pattern.memento;

import org.junit.Test;

import static org.junit.Assert.*;

public class MementoTest {

    @Test
    public void method() {
        Original original = new Original("egg");

        //创建备忘录
        Memento memento = original.saveState();
        //这里如果用列表保存起来就是用户的操作历史等
        /***
         * @Todo
         * do much things
         * and restore the save point
         */
        original.setValue("bird");
        original.restore(memento);
        System.out.println("I'm back!"+original.getValue());


    }
}