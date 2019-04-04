package com.wayne.design.pattern.state;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {

    @Test
    public void method() {
        State state = new State();

        state.setValue(1);
        Context context = new Context(state);
        context.method();

        state.setValue(2);
        context.setState(state);
        context.method();
    }
}