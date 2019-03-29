package com.wayne.design.pattern.facade;

import org.junit.Test;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 11:00
 */
public class ComputerFacadeTest {

    @Test
    public void method(){
        //Facade 模式： 解决的是类之间的依赖关系
        ComputerFacade computer = new ComputerFacade();
        computer.startup();
        computer.shutdown();
    }

}