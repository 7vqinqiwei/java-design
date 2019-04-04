package com.wayne.design.pattern.visitor;

public interface ComputerPartVisitor {


    void visit(ComputerPart part);

    void visit(Mouse mouse);
}
