package com.wayne.design.pattern.abstractfactory;

import com.wayne.design.pattern.factory.Circle;
import com.wayne.design.pattern.factory.Rectangle;
import com.wayne.design.pattern.factory.Shape;
import com.wayne.design.pattern.factory.Square;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 14:00
 */
public class ShapeFactory extends AbstractFactory  {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (null == shape)return null;

        if("CIRCLE".equalsIgnoreCase(shape)){
            return new Circle();
        }else if("RECTANGLE".equalsIgnoreCase(shape)){
            return new Rectangle();
        }else if("SQUARE".equalsIgnoreCase(shape)){
            return new Square();
        }

        return null;
    }
}
