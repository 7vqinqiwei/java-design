package com.wayne.design.pattern.mediator;

import org.junit.Test;

public class MediatorTest {

    @Test
    public void method(){
        //创建一个中间者 -- 没有mediator作为中间者User1(User2)只能拥有User2(User1)的关联才能处理两者之间的逻辑
        Mediator mediator = new MyMediator();
        //建立用户之间的关联
        mediator.createMediator();
        //处理用户之间的行为
        mediator.chat();
    }

}