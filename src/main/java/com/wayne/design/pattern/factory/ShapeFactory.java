package com.wayne.design.pattern.factory;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 11:46
 */
public class ShapeFactory {

    /**
     * 工厂模式
     * 简单来说隐藏了创建的细节
     * 问题：只能返回同类产品
     * 新增的同类产品需要修改当前方法去
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        if (null == shapeType)return null;

        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }

        return null;
    }

}
