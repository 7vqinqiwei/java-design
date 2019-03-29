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
        //装饰器模式：在传递给decorator之后，decorator是只能增强修饰当前source类目标方法一定被执行
        Sourceable decorator = new Decorator(source);
        decorator.method();
    }
}