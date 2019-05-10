package com.wayne.design.structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void test() {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            Node node = new Node(i);
            stack.push(node);
        }
        while (stack.top != null){
            System.out.println(stack.pop());
        }
    }
}