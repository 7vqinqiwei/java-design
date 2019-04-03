package com.wayne.design.pattern.command;

import org.junit.Test;

public class CommandTest {

    @Test
    public void method(){
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }

}