package com.wayne.design.pattern.observer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:50
 */
public class ObserverTest {

    @Test
    public void watch() {
        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}