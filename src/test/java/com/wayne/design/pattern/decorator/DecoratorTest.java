package com.wayne.design.pattern.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: waynechin
 * @Date: 2019/3/28 17:42
 */
public class DecoratorTest {

    @Test
    public void method() {
        Sourceable source = new SourceImpl();
        Sourceable decorator = new Decorator(source);
        decorator.method();
    }
}