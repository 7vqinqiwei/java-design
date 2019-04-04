package com.wayne.design.pattern.visitor;

import org.junit.Test;

public class ComputerPartVisitorTest {

    @Test
    public void method(){
        Computer computer = new Computer();
        //computer 已经自身带了很多个原件
        //对于visitor含有所有原件的操作方法
        //否者相对应的computer就要实现原件的方法
        //这里需要保证这个逻辑不变至于如何实现每个原件的方法需要重写ComputerPartDisplayVisitor的方法
        computer.accept(new ComputerPartDisplayVisitor());
    }

}