package com.wayne.design.pattern.abstractfactory;

import com.wayne.design.pattern.factory.Shape;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 13:59
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);

}
