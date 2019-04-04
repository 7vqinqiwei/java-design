package com.wayne.design.pattern.visitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
