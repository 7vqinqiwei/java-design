package com.wayne.design.pattern.mediator;

public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void chat(User from,String msg) {
        System.out.println("<"+this.getName()+">想跟用户<"+from.getName()+">说:"+msg);
    }
}
