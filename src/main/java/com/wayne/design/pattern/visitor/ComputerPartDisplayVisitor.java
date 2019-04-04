package com.wayne.design.pattern.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

    @Override
    public void visit(ComputerPart part) {
        System.out.println("Displaying "+part.getClass().getName()+".");
    }
    //既可以使用相同的方法也可以写各个原件的方法
    @Override
    public void visit(Mouse mouse){
        System.out.println("this is new Mouse Vistor!");
    }

}
