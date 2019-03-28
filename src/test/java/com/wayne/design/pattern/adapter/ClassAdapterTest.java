package com.wayne.design.pattern.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: waynechin
 * @Date: 2019/3/28 17:45
 */
public class ClassAdapterTest {

    @Test
    public void method() {
        //类适配器 : 简单来说就是使用一个接口将原来的方法和新增的方法封装进去 然后只需要实现新方法的类
        // -- 此时适配器含有原方法和新方法的类  专注于新方法 原方法不动
        AdapterTargetable target = new ClassAdapter();
        target.method1();
        target.method2();

        //对象适配器 ： 将当前原对象传递到新接口的实现类上 至于怎么处理业务
        //这种方式可拓展的方式就多了
        ClassAdapterSource source = new ClassAdapterSource();
        AdapterTargetable targetable = new ObjectAdapterWrapper(source);
        targetable.method1();
        targetable.method2();

        //接口适配器 ：将接口变成抽象类（都实现空）字类只需继承抽象类 子类只实现所需要的方法并不是所有方法实现
        //这里需要说明方法的使用情况 否则方法的可用性不可知
        AdapterTargetable sub1 = new InterfaceAdapterSub1();
        AdapterTargetable sub2 = new InterfaceAdapterSub2();

        sub1.method1();
        sub1.method2();

        sub2.method1();
        sub2.method2();
    }
}