package com.wayne.design.pattern.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:31
 */
public class ContextTest {

    @Test
    public void executeStrategy() {

        Context context = new Context(new AddStrategy());
        System.out.println(context.executeStrategy(1,2));

        context = new Context(new SubStrategy());
        System.out.println(context.executeStrategy(4,3));

    }
}