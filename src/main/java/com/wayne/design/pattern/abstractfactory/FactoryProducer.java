package com.wayne.design.pattern.abstractfactory;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 14:03
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType){
        if(null == factoryType){return null;}

        if("SHAPE".equalsIgnoreCase(factoryType)){
            return new ShapeFactory();
        }else if("COLOR".equalsIgnoreCase(factoryType)){
            return new ColorFactory();
        }
        return null;
    }

}
