package com.wayne.design.pattern.visitor;

public class Computer {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    public void accept(ComputerPartVisitor computerPartVisitor){
        for (ComputerPart part : parts){
            part.accept(computerPartVisitor);
        }
    }

}
